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
    private static final String GET_APP_INFO_URI = "/api/open/app/info/" + VERSION;
    private static final String GET_PRODUCT_STOCK_URI = "/api/open/app/product/query/" + VERSION;
    private static final String CREATE_USER_URI = "/api/open/app/user/" + VERSION;
    private static final String CREATE_PROXY_USER_URI = "/api/open/app/proxy/user/" + VERSION;
    private static final String USER_AUTH_URI = "/api/open/app/userAuth/" + VERSION;
    private static final String DRAW_BY_PWD_URI = "/api/open/app/proxy/draw/pwd/" + VERSION;
    private static final String GET_ORDER_URI = "/api/open/app/order/" + VERSION;
    private static final String GET_INSTANCE_URI = "/api/open/app/instance/" + VERSION;
    private static final String GET_AREA_URI = "/api/open/app/area/" + VERSION;
    private static final String INSTANCE_OPEN_URI = "/api/open/app/instance/open/" + VERSION;
    private static final String INSTANCE_RENEW_URI = "/api/open/app/instance/renew/" + VERSION;
    private static final String INSTANCE_RELEASE_URI = "/api/open/app/instance/release/" + VERSION;
    private static final String PROXY_INFO_URI = "/api/open/app/proxy/info/" + VERSION;
    private static final String GET_PRODUCT_AREA_LIST_URI = "/api/open/app/product/area/" + VERSION;
    private static final String ADD_IP_WHITE_LIST_URI = "/api/open/app/proxy/addIpWhiteList/" + VERSION;
    private static final String DEL_IP_WHITE_LIST_URI = "/api/open/app/proxy/delIpWhiteList/" + VERSION;
    private static final String DRAW_BY_API_URI = "/api/open/app/proxy/draw/api/" + VERSION;
    private static final String PROXY_FLOW_USE_LOG_URI = "/api/open/app/proxy/flow/use/log/" + VERSION;
    private static final String GET_CITY_LIST_URI = "/api/open/app/city/list/" + VERSION;
    private static final String PROXY_RETURN_URI = "/api/open/app/proxy/return/" + VERSION;

    public static final String ENCRYPT_AES = "AES";

    private String endPoint;
    private String appKey;
    private String appSecret;

    public IpvClient(String endPoint, String appKey, String appSecret) {
        this.appKey = appKey;
        this.endPoint = endPoint;
        this.appSecret = appSecret;
    }

    public AppInfoResp getAppInfo() throws Exception {
        byte[] res = post(GET_APP_INFO_URI, null);
        AppInfoResp list = JSON.parseObject(new String(res), AppInfoResp.class);
        return list;
    }

    public List<AppProductSyncResp> getProductStock(AppProductSyncReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(GET_PRODUCT_STOCK_URI, params);
        List<AppProductSyncResp> list = JSON.parseArray(new String(res), AppProductSyncResp.class);
        return list;
    }

    public AppCreateUserResp createUser(AppUserReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(CREATE_USER_URI, params);
        AppCreateUserResp resp = JSON.parseObject(new String(res), AppCreateUserResp.class);
        return resp;
    }

    public AppProxyUserResp createProxyUser(AppProxyUserReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(CREATE_PROXY_USER_URI, params);
        AppProxyUserResp resp = JSON.parseObject(new String(res), AppProxyUserResp.class);
        return resp;
    }

    public AppAuthUserResp userAuth(AppAuthUserReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(USER_AUTH_URI, params);
        AppAuthUserResp resp = JSON.parseObject(new String(res), AppAuthUserResp.class);
        return resp;
    }

    public AppDrawByPwdResp drawByPwd(AppDrawByPwdReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(DRAW_BY_PWD_URI, params);
        AppDrawByPwdResp resp = JSON.parseObject(new String(res), AppDrawByPwdResp.class);
        return resp;
    }

    public AppOrderResp getOrder(AppGetOrderReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(GET_ORDER_URI, params);
        AppOrderResp resp = JSON.parseObject(new String(res), AppOrderResp.class);
        return resp;
    }

    public List<AppInstanceResp> getInstance(AppGetInstanceReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(GET_INSTANCE_URI, params);
        List<AppInstanceResp> list = JSON.parseArray(new String(res), AppInstanceResp.class);
        return list;
    }

    public List<AppAreaResp> getArea(AppGetAreaReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(GET_AREA_URI, params);
        System.out.println(new String(res));
        List<AppAreaResp> list = JSON.parseArray(new String(res), AppAreaResp.class);
        return list;
    }

    public AppOrderResp instanceOpen(AppInstanceOpenReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(INSTANCE_OPEN_URI, params);
        AppOrderResp resp = JSON.parseObject(new String(res), AppOrderResp.class);
        return resp;
    }

    public AppOrderResp instanceRenew(AppInstanceRenewReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(INSTANCE_RENEW_URI, params);
        AppOrderResp resp = JSON.parseObject(new String(res), AppOrderResp.class);
        return resp;
    }

    public AppInstanceReleaseResp instanceRelease(AppInstanceReleaseReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(INSTANCE_RELEASE_URI, params);
        AppInstanceReleaseResp resp = JSON.parseObject(new String(res), AppInstanceReleaseResp.class);
        return resp;
    }

    public AppProxyInfoResp proxyInfo(AppProxyInfoReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(PROXY_INFO_URI, params);
        AppProxyInfoResp resp = JSON.parseObject(new String(res), AppProxyInfoResp.class);
        return resp;
    }

    public List<AppProductAreaResp> productAreaList(AppProductAreaReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(GET_PRODUCT_AREA_LIST_URI, params);
        List<AppProductAreaResp> list = JSON.parseArray(new String(res), AppProductAreaResp.class);
        return list;
    }

    public AppAddIpWhiteListResp addIpWhiteList(AppAddIpWhiteListReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(ADD_IP_WHITE_LIST_URI, params);
        AppAddIpWhiteListResp resp = JSON.parseObject(new String(res), AppAddIpWhiteListResp.class);
        return resp;
    }

    public AppDelIpWhiteListResp delIpWhiteList(AppDelIpWhiteListReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(DEL_IP_WHITE_LIST_URI, params);
        AppDelIpWhiteListResp resp = JSON.parseObject(new String(res), AppDelIpWhiteListResp.class);
        return resp;
    }

    public AppDrawByApiResp drawByApi(AppDrawByApiReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(DRAW_BY_API_URI, params);
        AppDrawByApiResp resp = JSON.parseObject(new String(res), AppDrawByApiResp.class);
        return resp;
    }

    public AppFlowUseLogResp proxyFlowUseLog(AppFlowUseLogReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(PROXY_FLOW_USE_LOG_URI, params);
        AppFlowUseLogResp resp = JSON.parseObject(new String(res), AppFlowUseLogResp.class);
        return resp;
    }

    public List<AppCityAreaResp> getcityArea(AppCityAreaReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(GET_CITY_LIST_URI, params);
        System.out.println(new String(res));
        List<AppCityAreaResp> list = JSON.parseArray(new String(res), AppCityAreaResp.class);
        return list;
    }

    public AppFlowReturnResp proxyReturn(AppFlowReturnReq req) throws Exception {
        byte[] params = JSON.toJSONBytes(req);
        byte[] res = post(PROXY_RETURN_URI, params);
        AppFlowReturnResp resp = JSON.parseObject(new String(res), AppFlowReturnResp.class);
        return resp;
    }

    private byte[] post(String uri, byte[] data) throws Exception {
        byte[] resdata = new byte[0];
        // 创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();
        // 创建post方式请求对象
        HttpPost httpPost = new HttpPost(endPoint + uri);
        byte[] iv = appSecret.substring(0, 16).getBytes();
        String msg = "";
        if (data != null && data.length > 0) {
            byte[] key = appSecret.getBytes();
            byte[] en = AESCBC.encryptCBC(data, key, iv);
            msg = Base64.getEncoder().encodeToString(en);
        }
        AppOpenReq req = new AppOpenReq("" + System.currentTimeMillis(), "2.0", ENCRYPT_AES, appKey, msg);

        // 装填参数
        StringEntity s = new StringEntity(JSON.toJSONString(req), "utf-8");
        s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
                "application/json"));
        // 设置参数到请求对象中
        httpPost.setEntity(s);
        System.out.println("请求地址：" + endPoint + uri);
        httpPost.setHeader("Content-type", "application/json");

        // 执行请求操作，并拿到结果（同步阻塞）
        CloseableHttpResponse response = client.execute(httpPost);
        // 获取结果实体
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            String js = EntityUtils.toString(entity, "utf-8");
            // System.out.println(js);
            Res res = JSON.parseObject(js, Res.class);
            if (res.getCode() == 200) {
                byte[] de = Base64.getDecoder().decode(res.getData());
                resdata = AESCBC.decryptCBC(de, appSecret.getBytes(), iv);
            }
            // 按指定编码转换结果实体为String类型
        }
        EntityUtils.consume(entity);
        // 释放链接
        response.close();
        return resdata;
    }

}
