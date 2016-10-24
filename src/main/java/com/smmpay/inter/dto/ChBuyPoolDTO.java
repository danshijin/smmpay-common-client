package com.smmpay.inter.dto;

import java.util.Date;

public class ChBuyPoolDTO implements java.io.Serializable{
	private static final long serialVersionUID = -8443022704498098792L;
	private Integer id;

    private Integer itemsid;

    private Integer customerid;

    private Double quantity;

    private Integer unit;

    private String title;

    private String context;

    private Integer status;

    private Date createdat;

    private Integer createdby;

    private Date updatedat;

    private Integer updatedby;

    private Integer prostatus;

    private Integer commodityId;

    private Integer mallBuyId;

    private String mallUserAccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public Integer getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Integer getProstatus() {
        return prostatus;
    }

    public void setProstatus(Integer prostatus) {
        this.prostatus = prostatus;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getMallBuyId() {
        return mallBuyId;
    }

    public void setMallBuyId(Integer mallBuyId) {
        this.mallBuyId = mallBuyId;
    }

    public String getMallUserAccount() {
        return mallUserAccount;
    }

    public void setMallUserAccount(String mallUserAccount) {
        this.mallUserAccount = mallUserAccount == null ? null : mallUserAccount.trim();
    }
}