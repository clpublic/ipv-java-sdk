package com.ipipv.open.dto;

import java.util.List;

public class AppGetInstanceReq {
    private List<String> Instances;   //平台实例编号

    public List<String> getInstances() {
        return Instances;
    }

    public void setInstances(List<String> instances) {
        Instances = instances;
    }
}