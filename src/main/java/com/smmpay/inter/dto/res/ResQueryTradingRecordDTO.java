package com.smmpay.inter.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by tangshulei on 2015/11/16.
 */
public class ResQueryTradingRecordDTO implements Serializable {

    private static final long serialVersionUID = -5806952630947397789L;
    /**
     * 附属账号
     */
    private String subAccNo;

    /**
     * 交易类型
     */
    private String tranType;

    /**
     * 交易日期
     */
    private String tranDate;

    /**
     * 交易时间
     */
    private String tranTime;

    /**
     * 柜员交易号
     */
    private String tellerNo;

    /**
     * 交易序号
     */
    private String tranSeqNo;
    /**
     * 对方账号
     */
    private String accountNo;
    /**
     * 对方账户名称
     */
    private String accountNm;
    /**
     * 对方开户行名称
     */
    private String accBnkNm;
    /**
     * 借贷标志 (1) D：借，C：贷
     */
    private String loanFlag;
    /**
     * 交易金额
     */
    private BigDecimal tranAmt;
    /**
     * 账户余额
     */
    private BigDecimal accBalAmt;

    /**
     * 手续费金额
     */
    private BigDecimal pdgAmt;

    /**
     * 摘要
     */
    private String memo;

    /**
     * 打印校验码
     */
    private String verifyCode;

    public String getSubAccNo() {
        return subAccNo;
    }

    public void setSubAccNo(String subAccNo) {
        this.subAccNo = subAccNo;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getTellerNo() {
        return tellerNo;
    }

    public void setTellerNo(String tellerNo) {
        this.tellerNo = tellerNo;
    }

    public String getTranSeqNo() {
        return tranSeqNo;
    }

    public void setTranSeqNo(String tranSeqNo) {
        this.tranSeqNo = tranSeqNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNm() {
        return accountNm;
    }

    public void setAccountNm(String accountNm) {
        this.accountNm = accountNm;
    }

    public String getAccBnkNm() {
        return accBnkNm;
    }

    public void setAccBnkNm(String accBnkNm) {
        this.accBnkNm = accBnkNm;
    }

    public String getLoanFlag() {
        return loanFlag;
    }

    public void setLoanFlag(String loanFlag) {
        this.loanFlag = loanFlag;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public BigDecimal getAccBalAmt() {
        return accBalAmt;
    }

    public void setAccBalAmt(BigDecimal accBalAmt) {
        this.accBalAmt = accBalAmt;
    }

    public BigDecimal getPdgAmt() {
        return pdgAmt;
    }

    public void setPdgAmt(BigDecimal pdgAmt) {
        this.pdgAmt = pdgAmt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
