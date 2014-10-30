/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.domain.models;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class holds a single row from database table of CUSTOMER</p>
 */
public class CustomerVO extends BaseVO{

	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 1437855219423100488L;

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
	
	
}
