package com.smmpay.inter.dto.req;

/**
 * Created by tangshulei on 2015/11/6.
 */
public class CheckUserDTO {

    public static String CUDTO_CHECKTYPE_1 = "1"; //邮箱
    public static String CUDTO_CHECKTYPE_2 = "2"; //商城id

    private String checkType;
    private String userName;
    private String mallUserName;

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

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
}
