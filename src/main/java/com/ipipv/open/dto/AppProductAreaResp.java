package com.ipipv.open.dto;

public class AppProductAreaResp {
    private String productNo;  //平台产品编号
    private int    proxyType;  //代理类型
    private String areaCode;   //区域代码（洲）
    private String countryCode;//国家代码
    private String stateCode;  //州省代码
    private String cityCode;   //城市代码
    private int    status;     //状态 1=上架 -1=下架
    private String region;     //上游供应商区域

    public String getproductNo() {
    return productNo;
    }
    
    public void setproductNo(String productNo) {
        this.productNo = productNo;
    }
    
    public int getproxyType() {
    return proxyType;
    }
    
    public void setproxyType(int proxyType) {
        this.proxyType = proxyType;
    }
        
    public String getareaCode() {
    return areaCode;
    }
    
    public void setareaCode(String areaCode) {
        this.areaCode = areaCode;
    }
            
    public String getcountryCode() {
    return countryCode;
    }
    
    public void setcountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
                
    public String getstateCode() {
    return stateCode;
    }
    
    public void setstateCode(String stateCode) {
        this.stateCode = stateCode;
    }
                    
    public String getcityCode() {
    return cityCode;
    }
    
    public void setcityCode(String cityCode) {
        this.cityCode = cityCode;
    }
                        
    public int getstatus() {
    return status;
    }
    
    public void setstatus(int status) {
        this.status = status;
    }
                           
    public String getregion() {
    return region;
    }
    
    public void setregion(String region) {
        this.region = region;
    }
}
