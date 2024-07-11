package com.ipipv.open.dto;

public class AppOpenReq {
    private String reqId;
    private String version; // 版本 v2
    private String encrypt; // 加密方式 aes,rsa（版本2以上提供，默认aes,老接口rsa）aes cbc模式
    private String appKey;  // appKey
    private String params;  // 根据加密方式密文 转base64

    public AppOpenReq(){

    }

    public AppOpenReq(String reqId,String version,String encrypt,String appKey,String params){
        this.appKey = appKey;
        this.encrypt = encrypt;
        this.params = params;
        this.reqId = reqId;
        this.version = version;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
