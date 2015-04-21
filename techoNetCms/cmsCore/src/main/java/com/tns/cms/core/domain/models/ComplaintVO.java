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
 * <p>This class holds a single row from database table of COMPLAINT</p>
 */
public class ComplaintVO extends BaseVO {

	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 6402600692724207461L;

	private String complaintid;
	
	private String contractid;
	
	private String assignedUserid;
	
	private String complaintIsrepair;
	
	private String complaintType;
	
	private String complaintAdditionalContact;
	
	private String complaintComments;
	
	private String complaintStatus;
	
	private Date complaintCreateDate;
	
	private Date complaintCloseDate;
	
	private String complaintClosureComments;

	/**
	 * @return the complaintid
	 */
	public String getComplaintid() {
		return complaintid;
	}

	/**
	 * @param complaintid the complaintid to set
	 */
	public void setComplaintid(String complaintid) {
		this.complaintid = complaintid;
	}

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
	 * @return the assignedUserid
	 */
	public String getAssignedUserid() {
		return assignedUserid;
	}

	/**
	 * @param assignedUserid the assignedUserid to set
	 */
	public void setAssignedUserid(String assignedUserid) {
		this.assignedUserid = assignedUserid;
	}

	/**
	 * @return the complaintIsrepair
	 */
	public String getComplaintIsrepair() {
		return complaintIsrepair;
	}

	/**
	 * @param complaintIsrepair the complaintIsrepair to set
	 */
	public void setComplaintIsrepair(String complaintIsrepair) {
		this.complaintIsrepair = complaintIsrepair;
	}

	/**
	 * @return the complaintType
	 */
	public String getComplaintType() {
		return complaintType;
	}

	/**
	 * @param complaintType the complaintType to set
	 */
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	/**
	 * @return the complaintAdditionalContact
	 */
	public String getComplaintAdditionalContact() {
		return complaintAdditionalContact;
	}

	/**
	 * @param complaintAdditionalContact the complaintAdditionalContact to set
	 */
	public void setComplaintAdditionalContact(String complaintAdditionalContact) {
		this.complaintAdditionalContact = complaintAdditionalContact;
	}

	/**
	 * @return the complaintComments
	 */
	public String getComplaintComments() {
		return complaintComments;
	}

	/**
	 * @param complaintComments the complaintComments to set
	 */
	public void setComplaintComments(String complaintComments) {
		this.complaintComments = complaintComments;
	}

	/**
	 * @return the complaintStatus
	 */
	public String getComplaintStatus() {
		return complaintStatus;
	}

	/**
	 * @param complaintStatus the complaintStatus to set
	 */
	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	/**
	 * @return the complaintCreateDate
	 */
	public Date getComplaintCreateDate() {
		return complaintCreateDate;
	}

	/**
	 * @param complaintCreateDate the complaintCreateDate to set
	 */
	public void setComplaintCreateDate(Date complaintCreateDate) {
		this.complaintCreateDate = complaintCreateDate;
	}

	/**
	 * @return the complaintCloseDate
	 */
	public Date getComplaintCloseDate() {
		return complaintCloseDate;
	}

	/**
	 * @param complaintCloseDate the complaintCloseDate to set
	 */
	public void setComplaintCloseDate(Date complaintCloseDate) {
		this.complaintCloseDate = complaintCloseDate;
	}

	/**
	 * @return the complaintClosureComments
	 */
	public String getComplaintClosureComments() {
		return complaintClosureComments;
	}

	/**
	 * @param complaintClosureComments the complaintClosureComments to set
	 */
	public void setComplaintClosureComments(String complaintClosureComments) {
		this.complaintClosureComments = complaintClosureComments;
	}
	
	
	
	
}
