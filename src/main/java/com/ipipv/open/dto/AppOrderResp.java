package com.ipipv.open.dto;

public class AppOrderResp {
    private String orderNo;    //平台订单号
    private String appOrderNo; //渠道商（购买订单）订单号
    private int    type;       //订单类型 1=新建 2=续费 3=释放
    private int    status;     //订单状态 1=待处理 2=处理中 3=处理成功 4=处理失败 5=部分完成
    private int    count;      //购买数量
    private String amount;     //总价
    private int    refund;     //是否有退费 1存在退费
    private int    page;       //页码 原样返回
    private int    pageSize;   //每页显示数量  原样返回
    private int    total;      //订单对应实例总数量
    private AppInstanceResp    instances; //订单对应实例列表

    public String getappUsernam() {
        return appUsernam;
    }

    public void setappUsernam(String appUsernam) {
        this.appUsernam = appUsernam;
    }
    
    public String getappOrderNo() {
        return appOrderNo;
    }

    public void setappOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }
    
    public int gettype() {
        return type;
    }

    public void settype(int type) {
        this.apptype = type;
    }
    
    public int getstatus() {
        return status;
    }

    public void setstatus(int status) {
        this.status = status;
    }
    
    public int getcount() {
        return count;
    }

    public void setcount(int count) {
        this.count = count;
    }
    
    public String getamount() {
        return amount;
    }

    public void setamount(String amount) {
        this.amount = amount;
    }
    
    public int getrefund() {
        return refund;
    }

    public void setrefund(int refund) {
        this.refund = refund;
    }
    
    public int getpage() {
        return page;
    }

    public void setpage(int page) {
        this.page = page;
    }
    
    public int getpageSize() {
        return pageSize;
    }

    public void setpageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    public int gettotal() {
        return total;
    }

    public void settotal(int total) {
        this.total = total;
    }
    
    public AppInstanceResp getinstances() {
        return instances;
    }

    public void setinstances(AppInstanceResp instances) {
        this.instances = instances;
    }
}
    
    
