package com.ipipv.open.dto;

public class AppProxyUserReq {
    private String appUsername;      //渠道商子账号 该渠道商唯一 (不传随机生成) 不支持修改
    private String password;        //密码(不传随机生成)
    private int    limitFlow;       //动态流量上限
    private String mainUsername;    //平台主账号  选填 平台主账号和渠道商主账号两个必填一个
    private String appMainUsername; //渠道商主账号 选填 平台主账号和渠道商主账号两个必填一个
    private String remark;          //备注
    private int    status;          //状态 1=正常 2=禁用

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLimitFlow() {
        return limitFlow;
    }

    public void setLimitFlow(int limitFlow) {
        this.limitFlow = limitFlow;
    }

    public String getMainUsername() {
        return mainUsername;
    }

    public void setMainUsername(String mainUsername) {
        this.mainUsername = mainUsername;
    }

    public String getAppMainUsername() {
        return appMainUsername;
    }

    public void setAppMainUsername(String appMainUsername) {
        this.appMainUsername = appMainUsername;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}