package com.ipipv.open.dto;

import java.util.List;

public class AppProductSyncReq {
    private List<Integer> proxyType;

    public List<Integer> getProxyType() {
        return proxyType;
    }

    public void setProxyType(List<Integer> proxyType) {
        this.proxyType = proxyType;
    }
}
