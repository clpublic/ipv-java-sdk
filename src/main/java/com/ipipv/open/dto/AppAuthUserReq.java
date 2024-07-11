package com.ipipv.open.dto;

public class AppAuthUserReq {
    private String username;    //平台主账号 选填 平台主账号和渠道商主账号两个必填一个
    private String appUsername; //渠道商主账号 选填 平台主账号和渠道商主账号两个必填一个
    private int authType;    //认证类型 1 未实名 2 个人实名 3 企业实名
    private String authName;    //真实姓名或者企业名
    private String no;          //实名证件号码或者企业营业执照号码
    private String vsp;         //vsp

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public int getAuthType() {
        return authType;
    }

    public void setAuthType(int authType) {
        this.authType = authType;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getVsp() {
        return vsp;
    }

    public void setVsp(String vsp) {
        this.vsp = vsp;
    }
}