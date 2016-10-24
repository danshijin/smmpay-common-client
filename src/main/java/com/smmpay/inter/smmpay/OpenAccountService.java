package com.smmpay.inter.smmpay;

import java.util.Map;

import com.smmpay.inter.dto.res.ReturnDTO;

/**
 * 签约开户
 * @author zengshihua
 *
 */
public interface OpenAccountService {

	ReturnDTO openAccount(Map<String,String> map);
}
