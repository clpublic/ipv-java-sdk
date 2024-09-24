package com.ipipv.open.dto;

import java.util.List;

public class AppInstanceOpenReq {
    private String appOrderNo;  //购买者订单号(渠道商订单号),同一个订单保持唯一，我方或作幂等性检查
    private List<OpenParam> params;   //购买代理产品列表

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public List<OpenParam> getParams() {
        return params;
    }

    public void setParams(List<OpenParam> params) {
        this.params = params;
    }
}