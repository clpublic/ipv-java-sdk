package com.ipipv.open.dto;

public class AppGetAreaReq {
    private String codes;  //获取地域代码对应表，为null获取全部

    public String getcodes() {
        return codes;
    }

    public void setcodes(String codes) {
        this.codes = codes;
    }
}