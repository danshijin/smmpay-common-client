package com.smmpay.inter.smmpay;

import java.util.Map;

import com.smmpay.inter.dto.res.ReturnDTO;

public interface BankService {
	//获取所有的主行
	public ReturnDTO getAllBank(Map<String, String> map);
	//获取所有的省
	public ReturnDTO getAllProvince(Map<String, String> map);
	//根据省获取市
	public ReturnDTO getCitys(Map<String,String> map);
	//根据主行和城市获取银行列表
	public ReturnDTO getBankByCity(Map<String,String> map);
	//根据主行和城市获取银行列表并且模糊查询
	public ReturnDTO getBankByCityLike(Map<String,String> map);

}
