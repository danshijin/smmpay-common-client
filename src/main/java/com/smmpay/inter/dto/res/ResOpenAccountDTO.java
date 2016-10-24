package com.smmpay.inter.dto.res;

import java.io.Serializable;

public class ResOpenAccountDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2679601457455596792L;

	/**
	 * 交易状态
	 */
	private String status;
	
	/**
	 * 交易状态信息
	 */
	private String statusText;
	
	/**
	 * 附属账户名称
	 */
	private String subAccNm;
	
	/**
	 * 附属账号
	 */
	private String subAccNo;

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getSubAccNm() {
		return subAccNm;
	}

	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
	}

	public String getSubAccNo() {
		return subAccNo;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}
	
}
