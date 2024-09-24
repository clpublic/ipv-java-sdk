package com.ipipv.open;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ipipv.open.dto.*;

public class IpvCliestTest {

    IpvClient ipv;

    @BeforeEach
    public void before() {
        String endPoint = "https://sandbox.ipipv.com";
        String appKey = "AK20240708150154";
        String appSecret = "xx1vsogzzvqvrgml7f6sc233p8vdqev2";
        ipv = new IpvClient(endPoint, appKey, appSecret);
    }

    @Test
    void testGetAppInfo() throws Exception {
        AppInfoResp resp = ipv.getAppInfo();
        System.out.println(resp);
    }

    @Test
    void testGetArea() throws Exception {
        AppGetAreaReq req = new AppGetAreaReq();
        List<AppAreaResp> resp = ipv.getArea(req);
        System.out.println(resp);
    }

    @Test
    void testGetCityArea() throws Exception {
        AppCityAreaReq req = new AppCityAreaReq();
        List<AppCityAreaResp> resp = ipv.getcityArea(req);
        System.out.println(resp);
    }

    @Test
    void testGetProductStock() throws Exception {
        AppProductSyncReq req = new AppProductSyncReq();
        List<AppProductSyncResp> resp = ipv.getProductStock(req);
        System.out.println(resp);
    }

    @Test
    void testDelIpWhiteList() throws Exception {
        AppDelIpWhiteListReq req3 = new AppDelIpWhiteListReq();
        req3.setAppUsername("aaa");
        req3.setIp("127.0.0.1");
        AppDelIpWhiteListResp resp3 = ipv.delIpWhiteList(req3);
        System.out.println(resp3);
    }

    @Test
    void testInstanceOpen() throws Exception {
        AppInstanceOpenReq req = new AppInstanceOpenReq();
        req.setAppOrderNo(Tool.getOrder());
        List<OpenParam> params = new ArrayList<>();
        OpenParam param = new OpenParam();
        param.setCount(1);
        param.setProductNo("ali_460");
        params.add(param);
        req.setParams(params);

        AppOrderResp resp = ipv.instanceOpen(req);
        System.out.println(resp);
    }

    @Test
    void testAddIpWhiteList() throws Exception {
        AppAddIpWhiteListReq req3 = new AppAddIpWhiteListReq();
        req3.setAppUsername("aaa");
        req3.setIp("127.0.0.1");
        AppAddIpWhiteListResp resp3 = ipv.addIpWhiteList(req3);
        System.out.println(resp3);
    }

    @Test
    void testUserAuth() throws Exception {
        AppAuthUserReq req = new AppAuthUserReq();
        req.setUsername("abab");
        req.setAuthType(1);
        AppAuthUserResp resp = ipv.userAuth(req);
        System.out.println(resp);
    }

    @Test
    void testcreateUser() throws Exception {
        AppUserReq req = new AppUserReq();
        req.setAppUsername("abab123");
        req.setPassword("abab");
        req.setPhone("111111");
        req.setEmail("123456@.com");
        req.setAuthType(1);
        req.setNo("abc12345");
        req.setStatus(1);
        AppCreateUserResp resp = ipv.createUser(req);
        System.out.println(resp);
    }

    @Test
    void testDrawByApi() throws Exception {
        AppDrawByApiReq req = new AppDrawByApiReq();
        req.setAppUsername("abab123");
        req.setProxyType(104);
        req.setAddressCode("cityCode");
        req.setMaxFlowLimit(50);
        AppDrawByApiResp resp = ipv.drawByApi(req);
        System.out.println(resp);
    }

    @Test
    void testDrawByPwd() throws Exception {
        AppDrawByPwdReq req = new AppDrawByPwdReq();
        req.setAppUsername("abab123");
        req.setAddressCode("cityCode");
        req.setProxyType(104);
        req.setMaxFlowLimit(50);
        AppDrawByPwdResp resp = ipv.drawByPwd(req);
        System.out.println(resp);
    }

    @Test
    void testProxyFlowUseLog() throws Exception {
        AppFlowUseLogReq req = new AppFlowUseLogReq();
        req.setAppUsername("abab123");
        req.setEndTime("2024-07-20 15:30:10");
        AppFlowUseLogResp resp = ipv.proxyFlowUseLog(req);
        System.out.println(resp);
    }

    @Test
    void testproxyReturn() throws Exception {
        AppFlowReturnReq req = new AppFlowReturnReq();
        req.setAppUsername("abab123");
        req.setProxyType(104);
        AppFlowReturnResp resp = ipv.proxyReturn(req);
        System.out.println(resp);
    }

    @Test
    void testgetInstance() throws Exception {
        AppGetInstanceReq req = new AppGetInstanceReq();
        req.setInstances(null);
        List<AppInstanceResp> resp = ipv.getInstance(req);
        System.out.println(resp);
    }

    @Test
    void testInstanceRenew() throws Exception {
        AppInstanceOpenReq req = new AppInstanceOpenReq();
        req.setAppOrderNo("01");
        AppOrderResp resp = ipv.instanceOpen(req);
        System.out.println(resp);
    }

    @Test
    void testGetOrder() throws Exception {
        AppGetOrderReq req = new AppGetOrderReq();
        req.setOrderNo("1234");
        AppOrderResp resp = ipv.getOrder(req);
        System.out.println(resp);
    }

    @Test
    void testinstanceRelease() throws Exception {
        AppInstanceReleaseReq req = new AppInstanceReleaseReq();
        req.setOrderNo("1234");
        req.setInstances(null);
        AppInstanceReleaseResp resp = ipv.instanceRelease(req);
        System.out.println(resp);
    }

    @Test
    void testproductAreaList() throws Exception {
        AppProductAreaReq req = new AppProductAreaReq();
        req.setProductNo("a123456");
        req.setProxyType(104);
        List<AppProductAreaResp> resp = ipv.productAreaList(req);
        System.out.println(resp);
    }

    @Test
    void testproxyInfo() throws Exception {
        AppProxyInfoReq req = new AppProxyInfoReq();
        req.setUsername("abab");
        req.setProxyType(104);
        AppProxyInfoResp resp = ipv.proxyInfo(req);
        System.out.println(resp);
    }

    @Test
    void testcreateProxyUser() throws Exception {
        AppProxyUserReq req = new AppProxyUserReq();
        req.setLimitFlow(1000);
        req.setMainUsername("abab");
        req.setStatus(1);
        AppProxyUserResp resp = ipv.createProxyUser(req);
        System.out.println(resp);
    }
}
