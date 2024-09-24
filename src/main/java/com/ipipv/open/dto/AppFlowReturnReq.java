package com.ipipv.open.dto;

public class AppFlowReturnReq {
    private String appUsername; // 渠道商主账号 必要
    private int proxyType; // 代理类型 必填 104=动态国外 105=动态国内
    private int ipNum; // 回收ip数量  单位个  产品如果是按照ip数量购买 使用该字段
    private String productNo; // 产品编号
    private int flowNum; // 回收流量数量  单位M  产品如果是按照流量购买 使用该字段
    private String remark; // 备注 最多250个字符

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }

    public int getIpNum() {
        return ipNum;
    }

    public void setIpNum(int ipNum) {
        this.ipNum = ipNum;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public int getFlowNum() {
        return flowNum;
    }

    public void setFlowNum(int flowNum) {
        this.flowNum = flowNum;
    }

    public String getRemark() {
        return remark;
    }
}
