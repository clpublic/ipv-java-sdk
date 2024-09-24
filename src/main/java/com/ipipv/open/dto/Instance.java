package com.ipipv.open.dto;

public class Instance {
    private String instanceNo;//平台实例编号
    private int duration;//可选 时长 默认1

    public String getInstanceNo() {
        return instanceNo;
    }

    public void setInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
