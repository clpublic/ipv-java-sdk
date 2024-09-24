package com.ipipv.open.dto;

import java.util.List;

public class AppCityAreaReq {
     private List<String> codes;  //城市代码列表，为null获取全部

    public List<String> getCodes() {
        return codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }
}
