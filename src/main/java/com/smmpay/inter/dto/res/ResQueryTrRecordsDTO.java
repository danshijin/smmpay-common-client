package com.smmpay.inter.dto.res;

import java.io.Serializable;
import java.math.BigDecimal;

public class ResQueryTrRecordsDTO implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -401966836612129229L;

	/**
	 * 附属账号
	 */
	private String subAccNo;

	/**
	 * 交易类型
	 */
	private String TRANTYPE;

	/**
	 * 交易日期
	 */
	private String TRANDATE;

	/**
	 * 交易时间
	 */
	private String TRANTIME;

	/**
	 * 柜员交易号
	 */
	private String HOSTFLW;

	/**
	 * 交易序号
	 */
	private String HOSTSEQ;
	/**
	 * 对方账号
	 */
	private String OPPACCNO;
	/**
	 * 对方账户名称
	 */
	private String OPPACCNAME;
	/**
	 * 对方开户行名称
	 */
	private String OPPBRANCHNAME;
	/**
	 * 借贷标志 (1) D：借，C：贷
	 */
	private String CDFG;
	/**
	 * 交易金额
	 */
	private BigDecimal TRANAMT;
	/**
	 * 账户余额
	 */
	private BigDecimal ACCBAL;

	/**
	 * 手续费金额
	 */
	private BigDecimal XTSFAM;

	/**
	 * 摘要
	 */
	private String RESUME;

	/**
	 * 对方支付联行号
	 */
	private String OPPBANKNO;

	/**
	 *
	 */
	private String CRYTYPE;


	public String getSubAccNo() {
		return subAccNo;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public String getTRANTYPE() {
		return TRANTYPE;
	}

	public void setTRANTYPE(String tRANTYPE) {
		TRANTYPE = tRANTYPE;
	}

	public String getTRANDATE() {
		return TRANDATE;
	}

	public void setTRANDATE(String tRANDATE) {
		TRANDATE = tRANDATE;
	}

	public String getTRANTIME() {
		return TRANTIME;
	}

	public void setTRANTIME(String tRANTIME) {
		TRANTIME = tRANTIME;
	}

	public String getHOSTFLW() {
		return HOSTFLW;
	}

	public void setHOSTFLW(String hOSTFLW) {
		HOSTFLW = hOSTFLW;
	}

	public String getHOSTSEQ() {
		return HOSTSEQ;
	}

	public void setHOSTSEQ(String hOSTSEQ) {
		HOSTSEQ = hOSTSEQ;
	}

	public String getOPPACCNO() {
		return OPPACCNO;
	}

	public void setOPPACCNO(String oPPACCNO) {
		OPPACCNO = oPPACCNO;
	}

	public String getOPPACCNAME() {
		return OPPACCNAME;
	}

	public void setOPPACCNAME(String oPPACCNAME) {
		OPPACCNAME = oPPACCNAME;
	}

	public String getOPPBRANCHNAME() {
		return OPPBRANCHNAME;
	}

	public void setOPPBRANCHNAME(String oPPBRANCHNAME) {
		OPPBRANCHNAME = oPPBRANCHNAME;
	}

	public String getCDFG() {
		return CDFG;
	}

	public void setCDFG(String cDFG) {
		CDFG = cDFG;
	}

	public BigDecimal getTRANAMT() {
		return TRANAMT;
	}

	public void setTRANAMT(BigDecimal tRANAMT) {
		TRANAMT = tRANAMT;
	}

	public BigDecimal getACCBAL() {
		return ACCBAL;
	}

	public void setACCBAL(BigDecimal aCCBAL) {
		ACCBAL = aCCBAL;
	}

	public BigDecimal getXTSFAM() {
		return XTSFAM;
	}

	public void setXTSFAM(BigDecimal xTSFAM) {
		XTSFAM = xTSFAM;
	}

	public String getRESUME() {
		return RESUME;
	}

	public void setRESUME(String rESUME) {
		RESUME = rESUME;
	}

	public String getOPPBANKNO() {
		return OPPBANKNO;
	}

	public void setOPPBANKNO(String oPPBANKNO) {
		OPPBANKNO = oPPBANKNO;
	}

	public String getCRYTYPE() {
		return CRYTYPE;
	}

	public void setCRYTYPE(String cRYTYPE) {
		CRYTYPE = cRYTYPE;
	}
}
