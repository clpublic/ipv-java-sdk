package com.ipipv.open.dto;

import java.util.Date;
import java.util.List;

public class AppInstanceResp {
    private String instanceNo;   //平台实例编号（渠道商续费和释放操作使用该编号）
    private int proxyType;    //代理类型 101=静态云平台 102=静态国内家庭 103=静态国外家庭 104=动态国外 105=动态国内 201=whatsapp
    private String protocol;     //协议类型 多个用英文逗号分隔 1=socks5 2=http 3=https 4=ssh
    private String ip;           //代理ip地址
    private int port;         //代理端口
    private String regionId;     //区域地址
    private String countryCode;  //国家代码
    private String cityCode;     //城市代码
    private String useType;      //使用方式 多个用英文逗号分隔  1=账密 2=ip白名单 3=uuid（uuid写password内）
    private String username;     //账户名或uuid 动态为平台主账号
    private String pwd;          //密码
    private String orderNo;      //创建该实例的平台订单号
    private int userExpired;  //到期时间
    private float flowTotal;    //总流量
    private float flowBalance;  //剩余流量
    private int status;       //1=待创建 2=创建中 3=运行中 6=已停止 10=关闭 11=释放
    private int renew;        //1 自动续费
    private List<String> bridges;      //桥地址列表
    private Date openAt;    //开通时间
    private Date renewAt;   //最后成功续费时间
    private Date releaseAt; //释放成功时间

    public String getInstanceNo() {
        return instanceNo;
    }

    public void setInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getUserExpired() {
        return userExpired;
    }

    public void setUserExpired(int userExpired) {
        this.userExpired = userExpired;
    }

    public float getFlowTotal() {
        return flowTotal;
    }

    public void setFlowTotal(float flowTotal) {
        this.flowTotal = flowTotal;
    }

    public float getFlowBalance() {
        return flowBalance;
    }

    public void setFlowBalance(float flowBalance) {
        this.flowBalance = flowBalance;
    }

    public int getRenew() {
        return renew;
    }

    public void setRenew(int renew) {
        this.renew = renew;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getBridges() {
        return bridges;
    }

    public void setBridges(List<String> bridges) {
        this.bridges = bridges;
    }

    public Date getOpenAt() {
        return openAt;
    }

    public void setOpenAt(Date openAt) {
        this.openAt = openAt;
    }

    public Date getRenewAt() {
        return renewAt;
    }

    public void setRenewAt(Date renewAt) {
        this.renewAt = renewAt;
    }

    public Date getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(Date releaseAt) {
        this.releaseAt = releaseAt;
    }
}