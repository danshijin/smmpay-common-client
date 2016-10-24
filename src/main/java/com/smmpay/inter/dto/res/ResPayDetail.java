package com.smmpay.inter.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by tangshulei on 2015/11/11.
 */
public class ResPayDetail implements Serializable {

    private static final long serialVersionUID = -7186096962890068934L;
    private Integer paymentId;
    private String oppositCompanyName;
    private String oppositPayChannelAccount;
    private String mallOrderId;
    private String productName;
    private String productDetail;
    private BigDecimal productNum;
    private BigDecimal dealMoney;
    private String createTime;
    private String doneTime;
    private String freezeTime;
    private String settlementType;
    private String dealType;
    private String invoice;
    private String paymentType;
    private String paymentTime;
    private String paymentCode;
    private Integer paymentStatus;
    private int sellOrBuy; //1 买方 2 卖方
    private String orderCreateTime;

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public int getSellOrBuy() {
        return sellOrBuy;
    }

    public void setSellOrBuy(int sellOrBuy) {
        this.sellOrBuy = sellOrBuy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDoneTime() {
        return doneTime;
    }

    public void setDoneTime(String doneTime) {
        this.doneTime = doneTime;
    }

    public String getFreezeTime() {
        return freezeTime;
    }

    public void setFreezeTime(String freezeTime) {
        this.freezeTime = freezeTime;
    }

    public String getMallOrderId() {
        return mallOrderId;
    }

    public void setMallOrderId(String mallOrderId) {
        this.mallOrderId = mallOrderId;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getOppositCompanyName() {
        return oppositCompanyName;
    }

    public void setOppositCompanyName(String oppositCompanyName) {
        this.oppositCompanyName = oppositCompanyName;
    }

    public String getOppositPayChannelAccount() {
        return oppositPayChannelAccount;
    }

    public void setOppositPayChannelAccount(String oppositPayChannelAccount) {
        this.oppositPayChannelAccount = oppositPayChannelAccount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public BigDecimal getProductNum() {
        return productNum;
    }

    public void setProductNum(BigDecimal productNum) {
        this.productNum = productNum;
    }

    public BigDecimal getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(BigDecimal dealMoney) {
        this.dealMoney = dealMoney;
    }


    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }
}
