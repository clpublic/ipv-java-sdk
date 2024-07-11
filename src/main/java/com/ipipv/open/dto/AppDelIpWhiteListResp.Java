package com.ipipv.open.dto;

import java.util.List;

public class AppDelIpWhiteListResp {
    private List<String> ipWhiteList;  //ip白名单

    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }
}
