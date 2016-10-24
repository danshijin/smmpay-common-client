package com.smmpay.inter.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by tangshulei on 2015/11/11.
 */
public class ResPaymentRecordDTO implements Serializable{

    private static final long serialVersionUID = 6702791010704376302L;
    private int paymentId;
    private String mallOrderId;
    //    private String bankName;
    private String applyTime;
    private String productName;
    private String productDetail;
    private String opposit;
    private BigDecimal dealMoney;
    private String paymentStatus;
    private int sellOrBuy;

    public int getSellOrBuy() {
        return sellOrBuy;
    }

    public void setSellOrBuy(int sellOrBuy) {
        this.sellOrBuy = sellOrBuy;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getMallOrderId() {
        return mallOrderId;
    }

    public void setMallOrderId(String mallOrderId) {
        this.mallOrderId = mallOrderId;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
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

    public String getOpposit() {
        return opposit;
    }

    public void setOpposit(String opposit) {
        this.opposit = opposit;
    }

    public BigDecimal getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(BigDecimal dealMoney) {
        this.dealMoney = dealMoney;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
