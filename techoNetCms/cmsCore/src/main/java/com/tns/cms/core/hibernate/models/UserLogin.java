/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.hibernate.models;

import java.util.Date;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class object holds a single row from the database table of USER_LOGIN</p>
 */
public class UserLogin{

	private String userid;
	
	private String userFirstName;
	
	private String userLastName;
	
	private String userType;
	
	private String username;
	
	private String userEmail;
	
	private String password;
		
	private String passwordResetString;
	
	private Date createDttm;
	
	private String createUserid;
	
	private Date updateDttm;
	
	private String updateUserid;

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
	 * @return the userFirstName
	 */
	public String getUserFirstName() {
		return userFirstName;
	}

	/**
	 * @param userFirstName the userFirstName to set
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * @return the userLastName
	 */
	public String getUserLastName() {
		return userLastName;
	}

	/**
	 * @param userLastName the userLastName to set
	 */
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the passwordResetString
	 */
	public String getPasswordResetString() {
		return passwordResetString;
	}

	/**
	 * @param passwordResetString the passwordResetString to set
	 */
	public void setPasswordResetString(String passwordResetString) {
		this.passwordResetString = passwordResetString;
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
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
}
