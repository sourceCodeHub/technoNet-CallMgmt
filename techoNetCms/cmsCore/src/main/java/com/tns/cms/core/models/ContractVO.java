/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.models;

import java.util.Date;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class maps a single row from database table of CONTRACTS </p>
 */
public class ContractVO extends BaseVO {
	
	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = -1101460093359422895L;

	private String contractid;
	
	private String customerid;
	
	private String contractType;
	
	private Date contractStartDate;
	
	private Date contractEndDate;
	
	private String contractAmount;
	
	private String contractPaymentTerm;
	
	private String productSerialNumber;
	
	private String contractComments;
	
	private String serviceTaxRate;
	
	private String PaymentRemarks;

	/**
	 * @return the contractid
	 */
	public String getContractid() {
		return contractid;
	}

	/**
	 * @param contractid the contractid to set
	 */
	public void setContractid(String contractid) {
		this.contractid = contractid;
	}

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
	 * @return the contractType
	 */
	public String getContractType() {
		return contractType;
	}

	/**
	 * @param contractType the contractType to set
	 */
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	/**
	 * @return the contractStartDate
	 */
	public Date getContractStartDate() {
		return contractStartDate;
	}

	/**
	 * @param contractStartDate the contractStartDate to set
	 */
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	/**
	 * @return the contractEndDate
	 */
	public Date getContractEndDate() {
		return contractEndDate;
	}

	/**
	 * @param contractEndDate the contractEndDate to set
	 */
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	/**
	 * @return the contractAmount
	 */
	public String getContractAmount() {
		return contractAmount;
	}

	/**
	 * @param contractAmount the contractAmount to set
	 */
	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}

	/**
	 * @return the contractPaymentTerm
	 */
	public String getContractPaymentTerm() {
		return contractPaymentTerm;
	}

	/**
	 * @param contractPaymentTerm the contractPaymentTerm to set
	 */
	public void setContractPaymentTerm(String contractPaymentTerm) {
		this.contractPaymentTerm = contractPaymentTerm;
	}

	/**
	 * @return the productSerialNumber
	 */
	public String getProductSerialNumber() {
		return productSerialNumber;
	}

	/**
	 * @param productSerialNumber the productSerialNumber to set
	 */
	public void setProductSerialNumber(String productSerialNumber) {
		this.productSerialNumber = productSerialNumber;
	}

	/**
	 * @return the contractComments
	 */
	public String getContractComments() {
		return contractComments;
	}

	/**
	 * @param contractComments the contractComments to set
	 */
	public void setContractComments(String contractComments) {
		this.contractComments = contractComments;
	}

	/**
	 * @return the serviceTaxRate
	 */
	public String getServiceTaxRate() {
		return serviceTaxRate;
	}

	/**
	 * @param serviceTaxRate the serviceTaxRate to set
	 */
	public void setServiceTaxRate(String serviceTaxRate) {
		this.serviceTaxRate = serviceTaxRate;
	}

	/**
	 * @return the paymentRemarks
	 */
	public String getPaymentRemarks() {
		return PaymentRemarks;
	}

	/**
	 * @param paymentRemarks the paymentRemarks to set
	 */
	public void setPaymentRemarks(String paymentRemarks) {
		PaymentRemarks = paymentRemarks;
	}	  
	

}
