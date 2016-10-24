package com.smmpay.inter.smmpay;

import com.smmpay.inter.dto.res.ReturnDTO;

import java.util.Map;

/**
 * Created by tangshulei on 2015/11/10.
 */
public interface TradingRecordService {

    /** 支付记录查询 **/
    ReturnDTO getPaymentRecord(Map<String, String> map);

    /** 支付详情查询 **/
    ReturnDTO getPaymentDetail(Map<String, String> map);

    /**关闭支付交易 **/
    ReturnDTO closePayment(Map<String,String> map);

    /** 交易记录查询 **/
    ReturnDTO getTradingRecord(Map<String, String> map);
}
