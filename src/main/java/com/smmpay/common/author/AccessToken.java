package com.smmpay.common.author;

/**
 * 请求令牌
 * @author wanghao
 *
 */
public class AccessToken {

	private String accessToken;
	private String uuid;
	//有效时间
	private Long expireTime;
	//验证状态
	private Integer isValid;
	public AccessToken() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccessToken(String accessToken, String uuid, Long expireTime,
			Integer veryfyStatus) {
		super();
		this.uuid = uuid;
		this.accessToken = accessToken;
		this.expireTime = expireTime;
		this.isValid = isValid;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Long getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}
	
	public Integer getIsValid() {
		return isValid;
	}
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
	
	
	
	
	
}
