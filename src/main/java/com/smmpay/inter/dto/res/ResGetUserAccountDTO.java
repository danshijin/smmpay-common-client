package com.smmpay.inter.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by tangshulei on 2015/11/9.
 */
public class ResGetUserAccountDTO implements Serializable{

    private static final long serialVersionUID = 2132401455979815009L;
    private String userId;

    private String userName;

    private BigDecimal totalMoney;

    private BigDecimal userMoney;

    private BigDecimal freezeMoney;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getFreezeMoney() {
        return freezeMoney;
    }

    public void setFreezeMoney(BigDecimal freezeMoney) {
        this.freezeMoney = freezeMoney;
    }
}
