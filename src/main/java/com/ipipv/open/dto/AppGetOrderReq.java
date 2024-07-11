package com.ipipv.open.dto;

public class AppGetOrderReq {
    private String orderNo;  // 平台订单编号
    private int    page;     // 页码  默认1
    private int    pageSize; // 每页显示数量  默认10 最大100

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
}