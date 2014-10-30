/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.hibernate.models;

import java.util.Date;
import java.util.Set;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class maps a single row from database table of CONTRACT </p>
 */
public class Contract{
	
	
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
	
	private Date createDttm;
	
	private String createUserid;
	
	private Date updateDttm;
	
	private String updateUserid;
	
	private Set<ContractProduct> contractProducts;
	
	private Set<Complaint> complaints;
	
	private Customer customer;

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

	/**
	 * @return the createDttm
	 */
	public Date getCreateDttm() {
		return createDttm;
	}

	/**
	 * @param createDttm the createDttm to set
	 */
	public void setCreateDttm(Date createDttm) {
		this.createDttm = createDttm;
	}

	/**
	 * @return the createUserid
	 */
	public String getCreateUserid() {
		return createUserid;
	}

	/**
	 * @param createUserid the createUserid to set
	 */
	public void setCreateUserid(String createUserid) {
		this.createUserid = createUserid;
	}

	/**
	 * @return the updateDttm
	 */
	public Date getUpdateDttm() {
		return updateDttm;
	}

	/**
	 * @param updateDttm the updateDttm to set
	 */
	public void setUpdateDttm(Date updateDttm) {
		this.updateDttm = updateDttm;
	}

	/**
	 * @return the updateUserid
	 */
	public String getUpdateUserid() {
		return updateUserid;
	}

	/**
	 * @param updateUserid the updateUserid to set
	 */
	public void setUpdateUserid(String updateUserid) {
		this.updateUserid = updateUserid;
	}

	/**
	 * @return the contractProducts
	 */
	public Set<ContractProduct> getContractProducts() {
		return contractProducts;
	}

	/**
	 * @param contractProducts the contractProducts to set
	 */
	public void setContractProducts(Set<ContractProduct> contractProducts) {
		this.contractProducts = contractProducts;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the complaints
	 */
	public Set<Complaint> getComplaints() {
		return complaints;
	}

	/**
	 * @param complaints the complaints to set
	 */
	public void setComplaints(Set<Complaint> complaints) {
		this.complaints = complaints;
	}
	

}
