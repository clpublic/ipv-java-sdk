package com.ipipv.open.dto;

public class AppAuthUserResp {
    private String username;     //平台账号
    private int    authStatus;   //认证状态 1=未实名 2=个人实名 3=企业实名
    
    public String getusername() {
    return username;
    }
    
    public void setusername(String username) {
        this.username = username;
    }
    
    public int getauthStatus() {
    return authStatus;
    }
    
    public void setauthStatus(int authStatus) {
        this.authStatus = authStatus;
    }
}