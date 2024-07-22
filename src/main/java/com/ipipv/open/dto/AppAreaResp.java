package com.ipipv.open.dto;

import java.util.List;

public class AppAreaResp {
    private String code;   //地域代码
    private String name;   //地域名称
    private String cname;  //地域中文名
    private List<AppAreaResp> children;  //下级地域

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<AppAreaResp> getChildren() {
        return children;
    }

    public void setChildren(List<AppAreaResp> children) {
        this.children = children;
    }
}