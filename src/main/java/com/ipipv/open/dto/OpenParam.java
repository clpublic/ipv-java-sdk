package com.ipipv.open.dto;

import java.util.List;

public class OpenParam {
    private String productNo; // 商品编号（如果存在，后面6项无意义）
    private int proxyType; // 代理类型 101=静态云平台 102=静态国内家庭 103=静态国外家庭 104=动态国外 105=动态国内 201=whatsapp
    private String countryCode; // 国家代码
    private String cityCode; // 城市代码
    private String supplierCode;// 供应商代码（可为null,随机分配）
    private int unit; // 单位 1=天 2=周(7天) 3=月(自然月) 4=年(自然年365，366) 10=无限制
    private int ispType; // isp类型 1=单isp 2=双isp
    private int count; // 购买数量 （实例个数）静态必填 默认1 一次最大20
    private int duration; // 必要 时长 默认1 为Unit的时长
    private boolean renew; // 是否续费 1续费 默认0
    private int extBandWidth;// 额外增加带宽 单位Mbps
    private String appUsername;// 渠道商主账号，开通动态代理的时候必填(必须在平台上注册过)
    private int flow; // 动态流量 最大102400MB 动态必填 单位MB
    private int useBridge; // 1=不上桥 2=上桥 默认0随app设置
    private List<CIDRBlock> cidrBlocks; // 静态购买所在网段及数量（产品有的才支持）
    private String projectId; // 购买项目id,保留字段，后续会支持

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getIspType() {
        return ispType;
    }

    public void setIspType(int ispType) {
        this.ispType = ispType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isRenew() {
        return renew;
    }

    public void setRenew(boolean renew) {
        this.renew = renew;
    }

    public int getExtBandWidth() {
        return extBandWidth;
    }

    public void setExtBandWidth(int extBandWidth) {
        this.extBandWidth = extBandWidth;
    }

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public int getUseBridge() {
        return useBridge;
    }

    public void setUseBridge(int useBridge) {
        this.useBridge = useBridge;
    }

    public List<CIDRBlock> getCidrBlocks() {
        return cidrBlocks;
    }

    public void setCidrBlocks(List<CIDRBlock> cidrBlocks) {
        this.cidrBlocks = cidrBlocks;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}