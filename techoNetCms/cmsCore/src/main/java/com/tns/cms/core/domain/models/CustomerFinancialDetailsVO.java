/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.domain.models;

import java.util.Date;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class holds a single row from the database table of CUSTOMER_FINANCIAL_DETAILS</p>
 */
public class CustomerFinancialDetailsVO extends BaseVO {

	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 1897007647892626392L;
	
	
	private String customerid;
	
	private String cin;
	
	private String pan;
	
	private String serviceTaxNumber;
	
	private String vatTin;
	
	private Date vatTinWef;
	
	private String cstTin;
	
	private Date cstTinWef;
	
	private String lbtNumber;
	
	private String bankAccountNumber;
	
	private String bankTptCode;
	

	/**
	 * @return the customerid
	 */
	public String getCustomerid() {
		return customerid;
	}

	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}

	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}

	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}

	/**
	 * @return the serviceTaxNumber
	 */
	public String getServiceTaxNumber() {
		return serviceTaxNumber;
	}

	/**
	 * @param serviceTaxNumber the serviceTaxNumber to set
	 */
	public void setServiceTaxNumber(String serviceTaxNumber) {
		this.serviceTaxNumber = serviceTaxNumber;
	}

	/**
	 * @return the vatTin
	 */
	public String getVatTin() {
		return vatTin;
	}

	/**
	 * @param vatTin the vatTin to set
	 */
	public void setVatTin(String vatTin) {
		this.vatTin = vatTin;
	}

	/**
	 * @return the vatTinWef
	 */
	public Date getVatTinWef() {
		return vatTinWef;
	}

	/**
	 * @param vatTinWef the vatTinWef to set
	 */
	public void setVatTinWef(Date vatTinWef) {
		this.vatTinWef = vatTinWef;
	}

	/**
	 * @return the cstTin
	 */
	public String getCstTin() {
		return cstTin;
	}

	/**
	 * @param cstTin the cstTin to set
	 */
	public void setCstTin(String cstTin) {
		this.cstTin = cstTin;
	}

	/**
	 * @return the cstTinWef
	 */
	public Date getCstTinWef() {
		return cstTinWef;
	}

	/**
	 * @param cstTinWef the cstTinWef to set
	 */
	public void setCstTinWef(Date cstTinWef) {
		this.cstTinWef = cstTinWef;
	}

	/**
	 * @return the lbtNumber
	 */
	public String getLbtNumber() {
		return lbtNumber;
	}

	/**
	 * @param lbtNumber the lbtNumber to set
	 */
	public void setLbtNumber(String lbtNumber) {
		this.lbtNumber = lbtNumber;
	}

	/**
	 * @return the bankAccountNumber
	 */
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	/**
	 * @param bankAccountNumber the bankAccountNumber to set
	 */
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	/**
	 * @return the bankTptCode
	 */
	public String getBankTptCode() {
		return bankTptCode;
	}

	/**
	 * @param bankTptCode the bankTptCode to set
	 */
	public void setBankTptCode(String bankTptCode) {
		this.bankTptCode = bankTptCode;
	}
	
	
}
