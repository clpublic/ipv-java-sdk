package com.ipipv.open.dto;

public class AppAuthUserReq {
    private String username;    //平台主账号 选填 平台主账号和渠道商主账号两个必填一个
    private String appUsername; //渠道商主账号 选填 平台主账号和渠道商主账号两个必填一个
    private int    authType;    //认证类型 1 未实名 2 个人实名 3 企业实名
    private String authName;    //真实姓名或者企业名
    private String no;          //实名证件号码或者企业营业执照号码
    private String vsp;         //vsp

    public String getusername() {
    return username;
    }
    
    public void setusername(String username) {
        this.username = username;
    }
    
    public String getappUsername() {
    return appUsername;
    }
    
    public void setappUsername(String appUsername) {
        this.appUsername = appUsername;
    }
        
    public String getauthType() {
    return authType;
    }
    
    public void setauthType(String authType) {
        this.authType = authType;
    }
            
    public int getauthName() {
    return authName;
    }
    
    public void setauthName(int authName) {
        this.authName = authName;
    }
                
    public int getno() {
    return no;
    }
    
    public void setno(int no) {
        this.no = no;
    }
                    
    public int getvsp() {
    return vsp;
    }
    
    public void setvsp(int vsp) {
        this.vsp = vsp;
    }
}