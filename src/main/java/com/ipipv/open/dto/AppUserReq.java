package com.ipipv.open.dto;

public class AppUserReq {
    private String appUsernam;  //渠道商主账号 该渠道商唯一 不支持修改
    private String password;    //主账号密码(不传随机生成)
    private String phone;       //主账号手机号
    private String email;       //主账号邮箱
    private int    authType;    //认证类型 1=未实名 2=个人实名 3=企业实名
    private String authName;    //主账号实名认证的真实名字或者企业名
    private String no;          //主账号实名认证的实名证件号码或者企业营业执照号码
    private Unit   vsp;         //vsp
    private int    status;      //状态 1=正常 2=禁用

    public String getappUsernam() {
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
        
    public String getphone() {
    return phone;
    }
    
    public void setphone(String phone) {
        this.phone = phone;
    }
            
    public String getemail() {
    return email;
    }
    
    public void setemail(String email) {
        this.email = email;
    }
                
    public int getauthType() {
    return authType;
    }
    
    public void setauthType(int authType) {
        this.authType = authType;
    }
                    
    public String getauthName() {
    return authName;
    }
    
    public void setauthName(String authName) {
        this.authName = authName;
    }
                        
    public String getno() {
    return no;
    }
    
    public void setno(String no) {
        this.no = no;
    }
                            
    public Unit getvsp() {
    return vsp;
    }
    
    public void setvsp(Uint vsp) {
        this.vsp = vsp;
    }
                                
    public int getstatus() {
    return status;
    }
    
    public void setstatus(int status) {
        this.status = status;
    }
}


