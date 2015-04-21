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
 * <p>This class holds a single row from the database table of EMAIL_ALERT</p>
 */
public class EmailAlert{

	
	private String alertEntityType;
	
	private String alertEntityid;
	
	private String emailSuccess;
	
	private String emailSentList;
	
	private String emailAlertComments;
	
	private Date createDttm;
	
	private String createUserid;

	/**
	 * @return the alertEntityType
	 */
	public String getAlertEntityType() {
		return alertEntityType;
	}

	/**
	 * @param alertEntityType the alertEntityType to set
	 */
	public void setAlertEntityType(String alertEntityType) {
		this.alertEntityType = alertEntityType;
	}

	/**
	 * @return the alertEntityid
	 */
	public String getAlertEntityid() {
		return alertEntityid;
	}

	/**
	 * @param alertEntityid the alertEntityid to set
	 */
	public void setAlertEntityid(String alertEntityid) {
		this.alertEntityid = alertEntityid;
	}

	/**
	 * @return the emailSuccess
	 */
	public String getEmailSuccess() {
		return emailSuccess;
	}

	/**
	 * @param emailSuccess the emailSuccess to set
	 */
	public void setEmailSuccess(String emailSuccess) {
		this.emailSuccess = emailSuccess;
	}

	/**
	 * @return the emailSentList
	 */
	public String getEmailSentList() {
		return emailSentList;
	}

	/**
	 * @param emailSentList the emailSentList to set
	 */
	public void setEmailSentList(String emailSentList) {
		this.emailSentList = emailSentList;
	}

	/**
	 * @return the emailAlertComments
	 */
	public String getEmailAlertComments() {
		return emailAlertComments;
	}

	/**
	 * @param emailAlertComments the emailAlertComments to set
	 */
	public void setEmailAlertComments(String emailAlertComments) {
		this.emailAlertComments = emailAlertComments;
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
	
		
}
