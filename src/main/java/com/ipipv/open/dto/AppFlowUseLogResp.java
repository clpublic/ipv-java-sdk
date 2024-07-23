package com.ipipv.open.dto;

import java.util.List;

public class AppFlowUseLogResp {
    private List<AppFlowUseLogItem> list; // 结束时间 可选当天 格式 2021-01-01 00:00:00
    private int total; // 总数量
    private int curPage; // 当前页

    public List<AppFlowUseLogItem> getList() {
        return list;
    }

    public void setList(List<AppFlowUseLogItem> list) {
        this.list = list;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }
}
