package com.smmpay.inter.smmpay;

import com.smmpay.inter.dto.res.ReturnDTO;

import java.util.Map;

/**
 * Created by tangshulei on 2015/11/5.
 */
public interface UserAccountService {

    /** 注册支付系统账号 **/
    ReturnDTO registerUser(Map<String, String> map);

    /** 注册时查看邮箱或商城账号是否存在 **/
    ReturnDTO checkUser(Map<String, String> map);

    /**支付账号登录 **/
    ReturnDTO loginUser(Map<String, String> map);

    /**支付账号密码修改 **/
    ReturnDTO updateUserPassword(Map<String, String> map);

    /**设置新密码 **/
    ReturnDTO setUserPassword(Map<String, String> map);

    /**商城注册 **/
    ReturnDTO registerUserFromMall(Map<String, String> map);

    /**根据code获取邮箱和商城账户 **/
    ReturnDTO getUserByCode(Map<String,String> map);

    /**获取支付账号余额 **/
    ReturnDTO getUserAccount(Map<String, String> map);

    /**支付账号绑定银行卡 **/
    ReturnDTO bindUserBank(Map<String, String> map);

    /**验证支付账号打款金额 **/
    ReturnDTO checkBankMoney(Map<String, String> map);

    /** 支付账号是否存在待验证银行卡  **/
    ReturnDTO checkBank(Map<String, String> map);

    /**获取支付账号银行卡信息 **/
    ReturnDTO getBank(Map<String, String> map);

    /**关闭已绑定银行卡 **/
    ReturnDTO updateUserBindBank(Map<String,String> map);

    /**出金 **/
    ReturnDTO getCash(Map<String,String> map);
}
