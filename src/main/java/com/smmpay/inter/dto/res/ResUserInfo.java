package com.smmpay.inter.dto.res;

import java.io.Serializable;

/**
 * Created by tangshulei on 2015/11/12.
 */
public class ResUserInfo implements Serializable {

    private String userName;
    private String mallUserName;
    private boolean isExist;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMallUserName() {
        return mallUserName;
    }

    public void setMallUserName(String mallUserName) {
        this.mallUserName = mallUserName;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setIsExist(boolean isExist) {
        this.isExist = isExist;
    }
}
