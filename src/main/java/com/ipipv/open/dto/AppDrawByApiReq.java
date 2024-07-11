package com.ipipv.open.dto;

public class AppDrawByApiReq {
    private String appUsername;  //渠道商主账号 必要
    private int   proxyType;    //代理类型 必要 104=动态国外 105=动态国内
    private int    num;          //提取ip数量 可选 默认1
    private String addressCode;  //地址代码 可选  取值 areaCode countryCode stateCode cityCode 四种之一
    private String protocol;     //协议 可选 默认socks5  取值 socks5 http 之一
    private String returnType;   //数据格式 可选 默认txt  取值 txt json 之一
    private int    delimiter;    //分隔符 可选 只有数据格式是txt的时候生效 默认1 (1=\r\n 2=/br 3=\r 4=\n 5=\t)
    private int    maxFlowLimit; //最大流量限制 可选 大于0的时候生效

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public int getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(int delimiter) {
        this.delimiter = delimiter;
    }

    public int getMaxFlowLimit() {
        return maxFlowLimit;
    }

    public void setMaxFlowLimit(int maxFlowLimit) {
        this.maxFlowLimit = maxFlowLimit;
    }
}
