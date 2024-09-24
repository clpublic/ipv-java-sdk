package com.ipipv.open.dto;

import java.util.List;

public class AppProductSyncReq {
    private List<Integer> proxyType; // 代理类型 101=静态云平台 102=静态国内家庭 103=静态国外家庭 104=动态国外 105=动态国内 201=whatsapp
    private String productNo; // 产品Id 如果传了产品Id，则只返回该Id对应的产品信息
    private String countryCode;// 国家代码 可选
    private String cityCode;// 城市代码 可选
    private String supplierCode;// 供应商代码 可选
    private int unit;// 时长单位，详见字典 可选
    private int ispType;// isp类型，详见字典 可选
    private int duration;// 相对于时长单位的最小购买时长 可选

    public List<Integer> getProxyType() {
        return proxyType;
    }

    public void setProxyType(List<Integer> proxyType) {
        this.proxyType = proxyType;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
