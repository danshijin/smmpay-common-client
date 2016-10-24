package com.smmpay.inter;

public interface AuthorService {

	/**
	 * 根据访问密钥得到访问令牌
	 */
	String getToken(String key,String id);
	
	/**
	 * 请求令牌有无过期
	 */
	boolean isInvalid();
}
