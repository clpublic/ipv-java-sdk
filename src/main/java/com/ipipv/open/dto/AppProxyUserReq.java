package com.ipipv.open.dto;

public class AppProxyUserReq {
    private String appUsernam;      //渠道商子账号 该渠道商唯一 (不传随机生成) 不支持修改
    private String password;        //密码(不传随机生成)
    private int    limitFlow;       //动态流量上限
    private String mainUsername;    //平台主账号  选填 平台主账号和渠道商主账号两个必填一个
    private String appMainUsername; //渠道商主账号 选填 平台主账号和渠道商主账号两个必填一个
    private String remark;          //备注
    private int    status;          //状态 1=正常 2=禁用

    public String getappUsername() {
    return appUsernam;
    }
    
    public void setappUsernam(String appUsernam) {
        this.appUsernam = appUsernam;
    }
    
    public String getpassword() {
    return password;
    }
    
    public void setpassword(String password) {
        this.password = password;
    }
    
    public int getlimitFlow() {
    return limitFlow;
    }
    
    public void setlimitFlow(int limitFlow) {
        this.limitFlow = limitFlow;
    }
    
    public String getmainUsername() {
    return mainUsername;
    }
    
    public void setmainUsername(String mainUsername) {
        this.mainUsername = mainUsername;
    }
        
    public String getappMainUsername() {
    return appMainUsername;
    }
    
    public void setappMainUsername(String appMainUsername) {
        this.appMainUsername = appMainUsername;
    }
    
    public int getremark() {
    return remark;
    }
    
    public void setremark(int remark) {
        this.remark = remark;
    }
    
    public String getstatus() {
    return status;
    }
    
    public void setstatus(String status) {
        this.status = status;
    }
}