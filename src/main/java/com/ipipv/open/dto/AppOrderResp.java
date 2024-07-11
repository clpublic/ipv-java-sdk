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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getRefund() {
        return refund;
    }

    public void setRefund(int refund) {
        this.refund = refund;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public AppInstanceResp getInstances() {
        return instances;
    }

    public void setInstances(AppInstanceResp instances) {
        this.instances = instances;
    }
}
    
    
