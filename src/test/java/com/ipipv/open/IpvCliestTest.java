package com.ipipv.open;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ipipv.open.dto.AppAreaResp;
import com.ipipv.open.dto.AppGetAreaReq;
import com.ipipv.open.dto.AppInstanceOpenReq;
import com.ipipv.open.dto.AppOrderResp;
import com.ipipv.open.dto.AppProductSyncReq;
import com.ipipv.open.dto.AppProductSyncResp;
import com.ipipv.open.dto.OpenParam;
import com.ipipv.open.dto.AppDelIpWhiteListReq;
import com.ipipv.open.dto.AppDelIpWhiteListResp;

public class IpvCliestTest {

    IpvClient ipv ;

    @BeforeEach  
    public void before() {  
        String endPoint = "https://sandbox.ipipv.com";
        String appKey = "AK20240708150154";
        String appSecret = "xx1vsogzzvqvrgml7f6sc233p8vdqev2";
        ipv = new IpvClient(endPoint, appKey, appSecret);
    }

    @Test
    void testGetArea() throws Exception{
        AppGetAreaReq req = new AppGetAreaReq();
        List<AppAreaResp> resp = ipv.getArea(req);
        System.out.println(resp);
    }

    @Test
    void testGetProductStock() throws Exception{
        AppProductSyncReq req = new AppProductSyncReq();
        List<AppProductSyncResp> resp = ipv.getProductStock(req);
        System.out.println(resp);
    }

    @Test
    void testDelIpWhiteList() throws Exception{
        AppDelIpWhiteListReq req3 = new AppDelIpWhiteListReq();
        req3.setAppUsername("aaa");
        req3.setIp("127.0.0.1");
        AppDelIpWhiteListResp resp3 = ipv.delIpWhiteList(req3);
        System.out.println(resp3);
    }

    @Test
    void testInstanceOpen() throws Exception{
        AppInstanceOpenReq req = new AppInstanceOpenReq();
        req.setAppOrderNo(Tool.getOrder());
        List<OpenParam> params =new ArrayList<>();
        OpenParam param = new OpenParam();
        param.setCount(1);
        param.setProductNo("ali_460");
        params.add(param);
        req.setParams(params);

        AppOrderResp resp = ipv.instanceOpen(req);
        System.out.println(resp);
    }


    
}
