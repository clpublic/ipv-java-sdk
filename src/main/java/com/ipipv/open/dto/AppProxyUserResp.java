package com.ipipv.open.dto;

public class AppProxyUserResp {
    private String appUsername;  //渠道商子账号
    private String username;    //平台子账号
    private String password;    //子账号密码
    private int    status;      //用户状态 1=正常 2=禁用
    private int    authStatus;  //认证状态 1=未实名 2=个人实名 3=企业实名

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }
}