package com.ipipv.open.dto;

public class AppAreaResp {
    private String code;   //地域代码
    private String name;   //地域名称
    private String cname;  //地域中文名
    private AppAreaResp    children;  //下级地域

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    
    public String getcname() {
        return cname;
    }

    public void setcname(String cname) {
        this.cname = cname;
    }
    
    public AppAreaResp getchildren() {
        return children;
    }

    public void setchildren(AppAreaResp children) {
        this.children = children;
    }
}