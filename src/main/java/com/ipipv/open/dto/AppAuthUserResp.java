package com.ipipv.open.dto;

public class AppAuthUserResp {
    private String username;     //平台账号
    private int    authStatus;   //认证状态 1=未实名 2=个人实名 3=企业实名

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }
}