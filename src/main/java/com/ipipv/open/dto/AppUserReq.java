package com.ipipv.open.dto;

public class AppUserReq {
    private String appUsername;  //渠道商主账号 该渠道商唯一 不支持修改
    private String password;    //主账号密码(不传随机生成)
    private String phone;       //主账号手机号
    private String email;       //主账号邮箱
    private int authType;    //认证类型 1=未实名 2=个人实名 3=企业实名
    private String authName;    //主账号实名认证的真实名字或者企业名
    private String no;          //主账号实名认证的实名证件号码或者企业营业执照号码
    private int vsp;         //vsp
    private int status;      //状态 1=正常 2=禁用

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getVsp() {
        return vsp;
    }

    public void setVsp(int vsp) {
        this.vsp = vsp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}


