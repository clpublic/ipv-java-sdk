package com.ipipv.open.dto;

public class AppInstanceResp {
    private String instanceNo;   //平台实例编号（渠道商续费和释放操作使用该编号）
    private Uint   proxyType;    //代理类型 101=静态云平台 102=静态国内家庭 103=静态国外家庭 104=动态国外 105=动态国内 201=whatsapp
    private String protocol;     //协议类型 多个用英文逗号分隔 1=socks5 2=http 3=https 4=ssh
    private String ip;           //代理ip地址
    private Uint   port;         //代理端口
    private String regionId;     //区域地址
    private String countryCode;  //国家代码
    private String cityCode;     //城市代码
    private String useType;      //使用方式 多个用英文逗号分隔  1=账密 2=ip白名单 3=uuid（uuid写password内）
    private String username;     //账户名或uuid 动态为平台主账号
    private String pwd;          //密码
    private String orderNo;      //创建该实例的平台订单号
    private int    userExpired;  //到期时间
    private float  flowTotal;    //总流量
    private float  flowBalance;  //剩余流量
    private int    status;       //1=待创建 2=创建中 3=运行中 6=已停止 10=关闭 11=释放
    private int    renew;        //1 自动续费
    private String bridges;      //桥地址列表
    private time.Time openAt;    //开通时间
    private time.Time renewAt;   //最后成功续费时间
    private time.Time releaseAt; //释放成功时间

    public String getinstanceNo() {
        return instanceNo;
    }

    public void setinstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
    }

    public Uint getproxyType() {
        return proxyType;
    }

    public void setproxyType(Uint proxyType) {
        this.proxyType = proxyType;
    }

    public String getprotocol() {
        return protocol;
    }

    public void setprotocol(String protocol) {
        this.protocol = protocol;
    }

    public String getip() {
        return ip;
    }

    public void setip(String ip) {
        this.ip = ip;
    }

    public Uint getport() {
        return port;
    }

    public void setport(Uint port) {
        this.port = port;
    }

    public String getregionId() {
        return regionId;
    }

    public void setregionId(String regionId) {
        this.regionId = regionId;
    }

    public String getcountryCode() {
        return countryCode;
    }

    public void setcountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getcityCode() {
        return cityCode;
    }

    public void setcityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getuseType() {
        return useType;
    }

    public void setuseType(String useType) {
        this.useType = useType;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public String getorderNo() {
        return orderNo;
    }

    public void setorderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getuserExpired() {
        return userExpired;
    }

    public void setuserExpired(int userExpired) {
        this.userExpired = userExpired;
    }

    public float getflowTotal() {
        return flowTotal;
    }

    public void setflowTotal(float flowTotal) {
        this.flowTotal = flowTotal;
    }

    public float getflowBalance() {
        return flowBalance;
    }

    public void setflowBalance(float flowBalance) {
        this.flowBalance = flowBalance;
    }

    public int getstatus() {
        return status;
    }

    public void setstatus(int status) {
        this.status = status;
    }

    public int getrenew() {
        return renew;
    }

    public void setrenew(int renew) {
        this.renew = renew;
    }

    public String getbridges() {
        return bridges;
    }

    public void setbridges(String bridges) {
        this.bridges = bridges;
    }

    public time.Time getopenAt() {
        return openAt;
    }

    public void setopenAt(time.Time openAt) {
        this.openAt = openAt;
    }

    public time.Time getrenewAt() {
        return renewAt;
    }

    public void setrenewAt(time.Time renewAt) {
        this.renewAt = renewAt;
    }

    public time.Time getreleaseAt() {
        return releaseAt;
    }

    public void setreleaseAt(time.Time releaseAt) {
        this.releaseAt = releaseAt;
    }
}