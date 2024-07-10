package com.ipipv.open.dto;

public class AppOpenReq {
    private String reqId;
    private String version;
    private String encrypt;
    private String appKey;
    private String params;

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

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
