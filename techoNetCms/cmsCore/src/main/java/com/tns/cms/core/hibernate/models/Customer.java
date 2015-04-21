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
 * <p>This class holds a single row from database table of CUSTOMER</p>
 */
public class Customer{

	
	private String customerid;
	
	private String userid;
	
	private String customerName;
	
	private String customerAddressLine1;
	
	private String customerAddressLine2;
	
	private String customerWebsite;
	
	private String customerRegion;
	
	private String customerType;
	
	private String customerIsactive;
	
	private String customerRemarks;
	
	private Date createDttm;
	
	private String createUserid;
	
	private Date updateDttm;
	
	private String updateUserid;
	
	private UserLogin userLogin;
	
	private Set<CustomerContact> customerContacts;
	
	private CustomerFinancialDetails customerFinancialDetail;

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
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerAddressLine1
	 */
	public String getCustomerAddressLine1() {
		return customerAddressLine1;
	}

	/**
	 * @param customerAddressLine1 the customerAddressLine1 to set
	 */
	public void setCustomerAddressLine1(String customerAddressLine1) {
		this.customerAddressLine1 = customerAddressLine1;
	}

	/**
	 * @return the customerAddressLine2
	 */
	public String getCustomerAddressLine2() {
		return customerAddressLine2;
	}

	/**
	 * @param customerAddressLine2 the customerAddressLine2 to set
	 */
	public void setCustomerAddressLine2(String customerAddressLine2) {
		this.customerAddressLine2 = customerAddressLine2;
	}

	/**
	 * @return the customerWebsite
	 */
	public String getCustomerWebsite() {
		return customerWebsite;
	}

	/**
	 * @param customerWebsite the customerWebsite to set
	 */
	public void setCustomerWebsite(String customerWebsite) {
		this.customerWebsite = customerWebsite;
	}

	/**
	 * @return the customerRegion
	 */
	public String getCustomerRegion() {
		return customerRegion;
	}

	/**
	 * @param customerRegion the customerRegion to set
	 */
	public void setCustomerRegion(String customerRegion) {
		this.customerRegion = customerRegion;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * @return the customerIsactive
	 */
	public String getCustomerIsactive() {
		return customerIsactive;
	}

	/**
	 * @param customerIsactive the customerIsactive to set
	 */
	public void setCustomerIsactive(String customerIsactive) {
		this.customerIsactive = customerIsactive;
	}

	/**
	 * @return the customerRemarks
	 */
	public String getCustomerRemarks() {
		return customerRemarks;
	}

	/**
	 * @param customerRemarks the customerRemarks to set
	 */
	public void setCustomerRemarks(String customerRemarks) {
		this.customerRemarks = customerRemarks;
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
	 * @return the userLogin
	 */
	public UserLogin getUserLogin() {
		return userLogin;
	}

	/**
	 * @param userLogin the userLogin to set
	 */
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	/**
	 * @return the customerContacts
	 */
	public Set<CustomerContact> getCustomerContacts() {
		return customerContacts;
	}

	/**
	 * @param customerContacts the customerContacts to set
	 */
	public void setCustomerContacts(Set<CustomerContact> customerContacts) {
		this.customerContacts = customerContacts;
	}

	/**
	 * @return the customerFinancialDetail
	 */
	public CustomerFinancialDetails getCustomerFinancialDetail() {
		return customerFinancialDetail;
	}

	/**
	 * @param customerFinancialDetail the customerFinancialDetail to set
	 */
	public void setCustomerFinancialDetail(
			CustomerFinancialDetails customerFinancialDetail) {
		this.customerFinancialDetail = customerFinancialDetail;
	}
	
	
}
