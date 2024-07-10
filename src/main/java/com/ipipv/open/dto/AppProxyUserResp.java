package com.ipipv.open.dto;

public class AppProxyUserResp {
    private String appUsernam;  //渠道商子账号
    private String username;    //平台子账号
    private String password;    //子账号密码
    private int    status;      //用户状态 1=正常 2=禁用
    private int    authStatus;  //认证状态 1=未实名 2=个人实名 3=企业实名

    public String getappUsernam() {
    return appUsernam;
    }
    
    public void setappUsernam(String appUsernam) {
        this.appUsernam = appUsernam;
    }
    
    public String getusername() {
    return username;
    }
    
    public void setusername(String username) {
        this.username = username;
    }
        
    public String getpassword() {
    return password;
    }
    
    public void setpassword(String password) {
        this.password = password;
    }
            
    public int getstatus() {
    return status;
    }
    
    public void setstatus(int status) {
        this.status = status;
    }
                
    public int getauthStatus() {
    return authStatus;
    }
    
    public void setauthStatus(int authStatus) {
        this.authStatus = authStatus;
    }
}