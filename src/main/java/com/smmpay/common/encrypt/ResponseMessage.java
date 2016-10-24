package com.smmpay.common.encrypt;

/**
 * 返回响应基类
 * @author wanghao
 *
 */
public class ResponseMessage {

	//返回状�?
	private String status;
	//返回信息
	private String statusText;
	//返回附属账号
	private String subAccNo;
	//返回附属账户名称
	private String subAccName;
	public ResponseMessage(){}
	public ResponseMessage(String status,String statusText){
		this.status = status;
		this.statusText = statusText;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubAccNo() {
		return subAccNo;
	}
	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}
	public String getSubAccName() {
		return subAccName;
	}
	public void setSubAccName(String subAccName) {
		this.subAccName = subAccName;
	}
	
	
}
