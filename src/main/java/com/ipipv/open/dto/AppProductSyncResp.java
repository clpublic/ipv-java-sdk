package com.ipipv.open.dto;

public class AppProductSyncResp {
    private String productNo;//必要，产品Id 保持唯一
    private String productName; //必要,商品名
    private int proxyType;    //必要, 101=静态云平台 102=静态国内家庭 103=静态国外家庭 104=动态国外 105=动态国内 201=whatsapp
    private String useType;        //必要, ,分割  1=账密 2=白名单 3=uuid
    private String protocol;       //必要,1=socks5 2=http 3=https 4=ssh
    private int useLimit;       //必要,1=出口ip国外 2=出口ip国内 3=无限制
    private int sellLimit;      //必要,1=大陆可售 2=海外可售 3=无限制
    private String areaCode;       //区域code
    private String countryCode;    //必要,国家代码 3位 iso标准
    private String stateCode;      //必要,州省代码 6位
    private String cityCode;      //必要,城市代码 向我方提取
    private String detail;       //商品描述
    private String costPrice;      //必要 价格
    private int inventory;      //必要 库存
    private int ipType;              //ip类型 1=ipv4 2=ipv6 3=随机 默认1
    private int ispType;       //ispType 1=单isp 2=双isp
    private int duration;      //必要 时长 0无限制
    private int unit;           //单位 1=天 2=周(7天) 3=月(自然月) 4=年(自然年365，366)
    private int bandWidth;      //带宽|流量时必要 单位 MB
    private int bandWidthType;  //带宽类型 1=独享 2=共享 3=流量包
    private String bandWidthPrice; //额外带宽价格
    private int maxBandWidth;   //可设置最大带宽
    private int flow;           //流量包
    private int cpu;     //cpu数
    private float memory;         //内存容量
    private int enable;         //是否可以购买 1可以
    private String supplierCode;   //供应商代码
    private CIDRBlock cidrBlocks;     //支持网段及数量 新增 2024/06/27

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(int useLimit) {
        this.useLimit = useLimit;
    }

    public int getSellLimit() {
        return sellLimit;
    }

    public void setSellLimit(int sellLimit) {
        this.sellLimit = sellLimit;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getIspType() {
        return ispType;
    }

    public void setIspType(int ispType) {
        this.ispType = ispType;
    }

    public int getIpType() {
        return ipType;
    }

    public void setIpType(int ipType) {
        this.ipType = ipType;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(int bandWidth) {
        this.bandWidth = bandWidth;
    }

    public int getBandWidthType() {
        return bandWidthType;
    }

    public void setBandWidthType(int bandWidthType) {
        this.bandWidthType = bandWidthType;
    }

    public String getBandWidthPrice() {
        return bandWidthPrice;
    }

    public void setBandWidthPrice(String bandWidthPrice) {
        this.bandWidthPrice = bandWidthPrice;
    }

    public int getMaxBandWidth() {
        return maxBandWidth;
    }

    public void setMaxBandWidth(int maxBandWidth) {
        this.maxBandWidth = maxBandWidth;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public CIDRBlock getCidrBlocks() {
        return cidrBlocks;
    }

    public void setCidrBlocks(CIDRBlock cidrBlocks) {
        this.cidrBlocks = cidrBlocks;
    }
}
