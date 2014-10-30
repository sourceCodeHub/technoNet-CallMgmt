/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.domain.models;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class holds a single row from the database table of EMAIL_ALERTS</p>
 */
public class EmailAlertVO extends BaseVO {

	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 4153718838175236505L;

	private String alertEntityType;
	
	private String alertEntityid;
	
	private String emailSuccess;
	
	private String emailSentList;
	
	private String emailAlertComments;

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
	
		
}
