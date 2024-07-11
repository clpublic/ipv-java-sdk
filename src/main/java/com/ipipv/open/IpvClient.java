package com.ipipv.open;

import com.alibaba.fastjson.JSON;
import com.ipipv.open.dto.*;
import com.ipipv.open.utils.AESCBC;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;


import java.util.Base64;
import java.util.List;


public class IpvClient {
    private static final String VERSION = "v2";
    private static final String GET_PRODUCT_STOCK_URI = "/api/open/app/product/query/" + VERSION;
    private static final String CREATE_USER_URI = "/api/open/app/user/" + VERSION;

    public static final String ENCRYPT_AES = "AES";

    private String endPoint;
    private String appKey;
    private String appSecret;

    public IpvClient(String endPoint , String appKey , String appSecret){
        this.appKey = appKey;
        this.endPoint = endPoint;
        this.appSecret = appSecret;
    }

    public List<AppProductSyncResp> getProductStock(AppProductSyncReq req) throws Exception{
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(GET_PRODUCT_STOCK_URI,params);
        List<AppProductSyncResp> list = JSON.parseArray(new String(res),AppProductSyncResp.class);
        return list;
    }

    public AppCreateUserResp createUser(AppUserReq req)throws Exception{
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(CREATE_USER_URI,params);
        AppCreateUserResp resp = JSON.parseObject(new String(res),AppCreateUserResp.class);
        return resp;
    }

    private byte[] post(String uri, byte[] data)throws Exception{
        byte[] resdata = new byte[0];
        //创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //创建post方式请求对象
        HttpPost httpPost = new HttpPost(endPoint+uri);

        byte [] key = appSecret.getBytes();
        byte [] iv = appSecret.substring(0,16).getBytes();
        byte [] en = AESCBC.encryptCBC(data,key,iv);
        String msg = Base64.getEncoder().encodeToString(en);

        AppOpenReq req = new AppOpenReq(""+System.currentTimeMillis(),"2.0",ENCRYPT_AES,appKey,msg);

        //装填参数
        StringEntity s = new StringEntity(JSON.toJSONString(req), "utf-8");
        s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
                "application/json"));
        //设置参数到请求对象中
        httpPost.setEntity(s);
        System.out.println("请求地址："+endPoint+uri);
        httpPost.setHeader("Content-type", "application/json");

        //执行请求操作，并拿到结果（同步阻塞）
        CloseableHttpResponse response = client.execute(httpPost);
        //获取结果实体
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            String js = EntityUtils.toString(entity,"utf-8");
            //System.out.println(js);
            Res res = JSON.parseObject(js, Res.class);
            if (res.getCode()==200){
                byte[] de = Base64.getDecoder().decode(res.getData());
                resdata = AESCBC.decryptCBC(de,appSecret.getBytes(),iv);
            }
            //按指定编码转换结果实体为String类型
        }
        EntityUtils.consume(entity);
        //释放链接
        response.close();
        return resdata;
    }

    public static void main(String []args) throws Exception {
        String endPoint = "https://sandbox.ipipv.com";
        String appKey = "AK20240510115408";
        String appSecret = "t84b334e1ghnw8vg7789ib3y2efd8qzb";
        IpvClient c = new IpvClient(endPoint,appKey,appSecret);
        AppProductSyncReq req = new AppProductSyncReq();
        List<AppProductSyncResp> resp = c.getProductStock(req);
        System.out.println(JSON.toJSONString(resp));
    }
}


