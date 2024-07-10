package com.ipipv.open.dto;

public class AppInstanceOpenReq {
    private String appOrderNo;  //购买者订单号(渠道商订单号)
    private OpenParam params;   //购买代理产品列表
    private String productNo;   //商品编号（如果存在，后面6项无意义）
    private Uint   proxyType;   //代理类型 101=静态云平台 102=静态国内家庭 103=静态国外家庭 104=动态国外 105=动态国内 201=whatsapp
    private String countryCode; //国家代码
    private String cityCode;    //城市代码
    private String supplierCode;//供应商代码（可为null,随机分配）
    private int    unit;        //单位 1=天 2=周(7天) 3=月(自然月) 4=年(自然年365，366) 10=无限制
    private int    ispType;     //isp类型 1=单isp 2=双isp
    private int    count;       //购买数量 （实例个数）静态必填 默认1 一次最大20
    private int    duration;    //必要 时长 默认1 为Unit的时长
    private Bool   renew;       //是否续费 1续费 默认0
    private int    extBandWidth;//额外增加带宽 单位Mbps
    private String    appUsername;//渠道商主账号，开通动态代理的时候必填(必须在平台上注册过)
    private int    flow;          //动态流量 最大102400MB 动态必填 单位MB
    private Uint   useBridge;     //1=使用桥 2=不使用桥 3=随app设置 默认3
    private CIDRBlock cidrBlocks; //静态购买所在网段及数量（产品有的才支持）
    private String    projectId;  //购买项目id,保留字段，后续会支持

     public String getappOrderNo() {
        return appOrderNo;
    }

    public void setappOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public OpenParam getParams() {
        return Params;
    }

    public void setParams(OpenParam Params) {
        this.Params = Params;
    }

     public String getproductNo() {
        return productNo;
    }

    public void setproductNo(String productNo) {
        this.productNo = productNo;
    }

    public Uint getproxyType() {
        return proxyType;
    }

    public void setproxyType(Uint proxyType) {
        this.proxyType = proxyType;
    }

    public String getcountryCode() {
        return countryCode;
    }

    public void setcountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getcityCode() {
        return cityCode;
    }

    public void setcityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getsupplierCode() {
        return supplierCode;
    }

    public void setsupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public int getunit() {
        return unit;
    }

    public void setunit(int unit) {
        this.unit = unit;
    }

    public int getispType() {
        return ispType;
    }

    public void setispType(int ispType) {
        this.ispType = ispType;
    }

    public int getcount() {
        return count;
    }

    public void setcount(int count) {
        this.count = count;
    }

    public int getduration() {
        return duration;
    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public Bool getrenew() {
        return renew;
    }

    public void setrenew(Bool renew) {
        this.renew = renew;
    }

    public int getextBandWidth() {
        return extBandWidth;
    }

    public void setextBandWidth(int extBandWidth) {
        this.extBandWidth = extBandWidth;
    }

    public String getappUsername() {
        return appUsername;
    }

    public void setappUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public int getflow() {
        return flow;
    }

    public void setflow(int flow) {
        this.flow = flow;
    }

    public Uint getuseBridge() {
        return useBridge;
    }

    public void setuseBridge(Uint useBridge) {
        this.useBridge = useBridge;
    }

    public CIDRBlock getcidrBlocks() {
        return cidrBlocks;
    }

    public void setcidrBlocks(CIDRBlock cidrBlocks) {
        this.cidrBlocks = cidrBlocks;
    }

    public String getprojectId() {
        return projectId;
    }

    public void setprojectId(String projectId) {
        this.projectId = projectId;
    }
}