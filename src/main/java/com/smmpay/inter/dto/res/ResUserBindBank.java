package com.smmpay.inter.dto.res;

import java.io.Serializable;

/**
 * Created by tangshulei on 2015/11/10.
 */
public class ResUserBindBank implements Serializable{

    private static final long serialVersionUID = -3393705312041736060L;
    private String bindId;
    private String bindBank;
    private String bindTypeId;
    private String bankName;
    private String province;
    private String city;
    private String bankAccountNo;
    private String bindTime;
    private String auditStatus;
    private String isPayment;

    public String getBindTypeId() {
        return bindTypeId;
    }

    public void setBindTypeId(String bindTypeId) {
        this.bindTypeId = bindTypeId;
    }

    public String getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(String isPayment) {
        this.isPayment = isPayment;
    }

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public String getBindBank() {
        return bindBank;
    }

    public void setBindBank(String bindBank) {
        this.bindBank = bindBank;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBindTime() {
        return bindTime;
    }

    public void setBindTime(String bindTime) {
        this.bindTime = bindTime;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
}
