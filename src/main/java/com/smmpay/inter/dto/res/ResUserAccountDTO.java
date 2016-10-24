package com.smmpay.inter.dto.res;

import java.io.Serializable;

/**
 * Created by tangshulei on 2015/11/5.
 */
public class ResUserAccountDTO implements Serializable{

    private static final long serialVersionUID = 2020705744330901746L;
    private Integer userId;
    /**用户名**/
    private String userName;
    /**商城账号**/
    private String mallUserName;
    /**营业执照编号 **/
    private String certificateNo;
    /** 营业执照图片**/
    private String certificateUrl;
    /**	公司名称 **/
    private String companyName;
    /**公司地址**/
    private String companyAddr;
    /**联系人 **/
    private String contactName;
    /**联系人电话 **/
    private String phone;
    /**联系人手机 **/
    private String mobilePhone;
    /**邮编 **/
    private String postCode;
    /**法人身份图片 **/
    private String idCardUrl;
    /**税务登记图片 **/
    private String registerCertificateUrl;

    private String registerIp;
    /**时间戳 **/
    private String date;

    private String lastLoginIp;

    private String accountNo;

    private String accountName;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
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

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getCertificateUrl() {
        return certificateUrl;
    }

    public void setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getIdCardUrl() {
        return idCardUrl;
    }

    public void setIdCardUrl(String idCardUrl) {
        this.idCardUrl = idCardUrl;
    }

    public String getRegisterCertificateUrl() {
        return registerCertificateUrl;
    }

    public void setRegisterCertificateUrl(String registerCertificateUrl) {
        this.registerCertificateUrl = registerCertificateUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
