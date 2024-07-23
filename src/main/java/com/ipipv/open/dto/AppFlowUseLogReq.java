package com.ipipv.open.dto;

public class AppFlowUseLogReq {
    private String appUsername; // 渠道商主账号 必要
    private String startTime; // 开始时间 可选 默认7天前 格式 2021-01-01 00:00:00
    private String endTime; // 结束时间 可选当天 格式 2021-01-01 00:00:00
    private int page; // 页码 可选 默认1
    private int pageSize; // 每页数量 可选 默认10 最大100

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
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
