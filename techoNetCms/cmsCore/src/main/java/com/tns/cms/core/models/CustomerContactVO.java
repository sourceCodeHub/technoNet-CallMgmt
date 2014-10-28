/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.models;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class holds a single row from the database table of CUSTOMER_CONTRACTS</p>
 */
public class CustomerContactVO extends BaseVO {

	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 3676015171721729597L;
		
	private String customerid;
	
	private String firstName;
	
	private String lastName;
	
	private String designation;
	
	private String mobilePhone;
	
	private String deskPhone;
	
	private String email;
	
	private String priorityIndex;

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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * @return the deskPhone
	 */
	public String getDeskPhone() {
		return deskPhone;
	}

	/**
	 * @param deskPhone the deskPhone to set
	 */
	public void setDeskPhone(String deskPhone) {
		this.deskPhone = deskPhone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the priorityIndex
	 */
	public String getPriorityIndex() {
		return priorityIndex;
	}

	/**
	 * @param priorityIndex the priorityIndex to set
	 */
	public void setPriorityIndex(String priorityIndex) {
		this.priorityIndex = priorityIndex;
	}
	
		

}
