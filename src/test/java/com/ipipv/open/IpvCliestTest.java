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
import com.ipipv.open.dto.AppAddIpWhiteListReq;
import com.ipipv.open.dto.AppAddIpWhiteListResp;
import com.ipipv.open.dto.AppAuthUserReq;
import com.ipipv.open.dto.AppAuthUserResp;
import com.ipipv.open.dto.AppCreateUserResp;
import com.ipipv.open.dto.AppDrawByApiReq;
import com.ipipv.open.dto.AppDrawByApiResp;
import com.ipipv.open.dto.AppDrawByPwdReq;
import com.ipipv.open.dto.AppDrawByPwdResp;
import com.ipipv.open.dto.AppFlowUseLogReq;
import com.ipipv.open.dto.AppFlowUseLogResp;
import com.ipipv.open.dto.AppGetInstanceReq;
import com.ipipv.open.dto.AppGetOrderReq;
import com.ipipv.open.dto.AppInstanceReleaseReq;
import com.ipipv.open.dto.AppInstanceReleaseResp;
import com.ipipv.open.dto.AppInstanceResp;
import com.ipipv.open.dto.AppProductAreaReq;
import com.ipipv.open.dto.AppProductAreaResp;
import com.ipipv.open.dto.AppProxyInfoReq;
import com.ipipv.open.dto.AppProxyInfoResp;
import com.ipipv.open.dto.AppProxyUserReq;
import com.ipipv.open.dto.AppProxyUserResp;
import com.ipipv.open.dto.AppUserReq;



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

    @Test
    void testAddIpWhiteList() throws Exception{
        AppAddIpWhiteListReq req3 = new AppAddIpWhiteListReq();
        req3.setAppUsername("aaa");
        req3.setIp("127.0.0.1");
        AppAddIpWhiteListResp resp3 = ipv.addIpWhiteList(req3);
        System.out.println(resp3);
    }
    
    @Test
    void testUserAuth() throws Exception {
        AppAuthUserReq req = new AppAuthUserReq();
        AppAuthUserResp resp = ipv.userAuth(req);
        System.out.println(resp);
    }

    @Test
    void testcreateUser() throws Exception{
        AppUserReq req = new AppUserReq();
        AppCreateUserResp resp = ipv.createUser(req);
        System.out.println(resp);
    }

    @Test
    void testDrawByApi() throws Exception {
        AppDrawByApiReq req = new AppDrawByApiReq();
        AppDrawByApiResp resp = ipv.drawByApi(req);
        System.out.println(resp);
    }

    @Test
    void testDrawByPwd() throws Exception {
        AppDrawByPwdReq req = new AppDrawByPwdReq();
        AppDrawByPwdResp resp = ipv.drawByPwd(req);
        System.out.println(resp);
    }

    @Test
    void testProxyFlowUseLog() throws Exception {
        AppFlowUseLogReq req = new AppFlowUseLogReq();
        AppFlowUseLogResp resp = ipv.proxyFlowUseLog(req);
        System.out.println(resp);
    }

    @Test
    void testgetInstance() throws Exception {
        AppGetInstanceReq req = new AppGetInstanceReq();
        List<AppInstanceResp> resp = ipv.getInstance(req);
        System.out.println(resp);
    }

    @Test
    void testInstanceRenew() throws Exception {
        AppInstanceOpenReq req = new AppInstanceOpenReq();
        AppOrderResp resp = ipv.instanceOpen(req);
        System.out.println(resp);
    }

    @Test 
    void testGetOrder() throws Exception{
        AppGetOrderReq req = new AppGetOrderReq();
        AppOrderResp resp = ipv.getOrder(req);
        System.out.println(resp);
    }

    @Test
    void testinstanceRelease() throws Exception{
        AppInstanceReleaseReq req = new AppInstanceReleaseReq();
        AppInstanceReleaseResp resp = ipv.instanceRelease(req);
        System.out.println(resp);
    }

    @Test
    void testproductAreaList() throws Exception{
        AppProductAreaReq req = new AppProductAreaReq();
        List<AppProductAreaResp> resp = ipv.productAreaList(req);
        System.out.println(resp);
    }

    @Test
    void testproxyInfo() throws Exception{
        AppProxyInfoReq req = new AppProxyInfoReq();
        AppProxyInfoResp resp = ipv.proxyInfo(req);
        System.out.println(resp);
    }

    @Test
    void testcreateProxyUser() throws Exception{
        AppProxyUserReq req = new AppProxyUserReq();
        AppProxyUserResp resp = ipv.createProxyUser(req);
        System.out.println(resp);
    }
}
