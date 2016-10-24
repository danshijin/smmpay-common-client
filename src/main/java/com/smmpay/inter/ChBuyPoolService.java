package com.smmpay.inter;

import java.util.Map;

import com.smmpay.inter.dto.ChBuyPoolDTO;



public interface ChBuyPoolService {

	/**
	 * 根据ID获得买盘信息
	 */
	ChBuyPoolDTO getChBuyPoolById(Map<String,String> map);
	
	/**
	 * 根据主键得到对象----无加解密
	 * @param id
	 * @return
	 */
    ChBuyPoolDTO getChBuyPoolByPrimary(Integer id);
}
