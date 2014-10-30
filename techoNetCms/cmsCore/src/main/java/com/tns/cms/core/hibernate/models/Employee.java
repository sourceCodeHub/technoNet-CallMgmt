/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.hibernate.models;

import java.io.InputStream;
import java.util.Date;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class object holds a single row from the database table of EMPLOYEE</p>
 */
public class Employee{

		
	private String employeeid;
	
	private String employeeFirstName;
	
	private String employeeLastName;
	
	private String employeeAddressLine1;
	
	private String employeeAddressLine2;
	
	private String employeeContactPhone;
	
	private String employeeContactMob;
	
	private String employeeContactEmail;
	
	private String employeeDesignation;
	
	private InputStream employeePhoto = null;
	
	private Date createDttm;
	
	private String createUserid;
	
	private Date updateDttm;
	
	private String updateUserid;

	/**
	 * @return the employeeid
	 */
	public String getEmployeeid() {
		return employeeid;
	}

	/**
	 * @param employeeid the employeeid to set
	 */
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	/**
	 * @return the employeeFirstName
	 */
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	/**
	 * @param employeeFirstName the employeeFirstName to set
	 */
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	/**
	 * @return the employeeLastName
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}

	/**
	 * @param employeeLastName the employeeLastName to set
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	/**
	 * @return the employeeAddressLine1
	 */
	public String getEmployeeAddressLine1() {
		return employeeAddressLine1;
	}

	/**
	 * @param employeeAddressLine1 the employeeAddressLine1 to set
	 */
	public void setEmployeeAddressLine1(String employeeAddressLine1) {
		this.employeeAddressLine1 = employeeAddressLine1;
	}

	/**
	 * @return the employeeAddressLine2
	 */
	public String getEmployeeAddressLine2() {
		return employeeAddressLine2;
	}

	/**
	 * @param employeeAddressLine2 the employeeAddressLine2 to set
	 */
	public void setEmployeeAddressLine2(String employeeAddressLine2) {
		this.employeeAddressLine2 = employeeAddressLine2;
	}

	/**
	 * @return the employeeContactPhone
	 */
	public String getEmployeeContactPhone() {
		return employeeContactPhone;
	}

	/**
	 * @param employeeContactPhone the employeeContactPhone to set
	 */
	public void setEmployeeContactPhone(String employeeContactPhone) {
		this.employeeContactPhone = employeeContactPhone;
	}

	/**
	 * @return the employeeContactMob
	 */
	public String getEmployeeContactMob() {
		return employeeContactMob;
	}

	/**
	 * @param employeeContactMob the employeeContactMob to set
	 */
	public void setEmployeeContactMob(String employeeContactMob) {
		this.employeeContactMob = employeeContactMob;
	}

	/**
	 * @return the employeeContactEmail
	 */
	public String getEmployeeContactEmail() {
		return employeeContactEmail;
	}

	/**
	 * @param employeeContactEmail the employeeContactEmail to set
	 */
	public void setEmployeeContactEmail(String employeeContactEmail) {
		this.employeeContactEmail = employeeContactEmail;
	}

	/**
	 * @return the employeeDesignation
	 */
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	/**
	 * @param employeeDesignation the employeeDesignation to set
	 */
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	/**
	 * @return the employeePhoto
	 */
	public InputStream getEmployeePhoto() {
		return employeePhoto;
	}

	/**
	 * @param employeePhoto the employeePhoto to set
	 */
	public void setEmployeePhoto(InputStream employeePhoto) {
		this.employeePhoto = employeePhoto;
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
	
}
