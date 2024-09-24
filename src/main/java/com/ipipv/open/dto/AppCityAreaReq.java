package com.ipipv.open.dto;

import java.util.List;

public class AppCityAreaReq {
     private List<String> codes;  //获取地域代码对应表，为null获取全部

    public List<String> getCodes() {
        return codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }
}
