package com.smmpay.inter.dto.res;

import java.io.Serializable;

/**
 * Created by tangshulei on 2015/11/10.
 */
public class ResTradingRecordDTO implements Serializable {

    private static final long serialVersionUID = 5948941622276608600L;
    private String trId;

    private String trApplyTime;

    private String trType;

    private String note;

    private String oppositAccount;

    private String trMoney;

    private String userMoney;

    private String trCharge;

    private String printCheckCode;

    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId;
    }

    public String getTrApplyTime() {
        return trApplyTime;
    }

    public void setTrApplyTime(String trApplyTime) {
        this.trApplyTime = trApplyTime;
    }

    public String getTrType() {
        return trType;
    }

    public void setTrType(String trType) {
        this.trType = trType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOppositAccount() {
        return oppositAccount;
    }

    public void setOppositAccount(String oppositAccount) {
        this.oppositAccount = oppositAccount;
    }

    public String getTrMoney() {
        return trMoney;
    }

    public void setTrMoney(String trMoney) {
        this.trMoney = trMoney;
    }

    public String getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(String userMoney) {
        this.userMoney = userMoney;
    }

    public String getTrCharge() {
        return trCharge;
    }

    public void setTrCharge(String trCharge) {
        this.trCharge = trCharge;
    }

    public String getPrintCheckCode() {
        return printCheckCode;
    }

    public void setPrintCheckCode(String printCheckCode) {
        this.printCheckCode = printCheckCode;
    }
}
