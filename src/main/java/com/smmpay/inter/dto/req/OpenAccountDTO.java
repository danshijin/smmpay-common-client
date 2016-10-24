package com.smmpay.inter.dto.req;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OpenAccountDTO implements Serializable{

	/**
	 * 附属账户名称
	 */
	private String subAccNm;

	
	public String getSubAccNm() {
		return subAccNm;
	}

	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
	}
	
	
	
}
