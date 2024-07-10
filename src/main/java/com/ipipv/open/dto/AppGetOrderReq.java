package com.ipipv.open.dto;

public class AppGetOrderReq {
    private String orderNo;  // 平台订单编号
    private int    page;     // 页码  默认1
    private int    pageSize; // 每页显示数量  默认10 最大100

    public String getorderNo() {
        return orderNo;
    }

    public void setorderNo(String orderNo) {
        this.orderNo = orderNo;
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
}