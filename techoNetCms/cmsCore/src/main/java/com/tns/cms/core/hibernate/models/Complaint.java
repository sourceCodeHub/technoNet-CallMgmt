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
 * <p>This class holds a single row from database table of COMPLAINT</p>
 */
public class Complaint{

	private String complaintid;
	
	private String contractid;
	
	private String assignedUserid;
	
	private String complaintIsrepair;
	
	private String complaintType;
	
	private String complaintAdditionalContact;
	
	private String complaintSummary;
	
	private String complaintComments;
	
	private String complaintStatus;
	
	private Date complaintCreateDate;
	
	private Date complaintCloseDate;
	
	private String complaintClosureComments;
	
	private Date createDttm;
	
	private String createUserid;
	
	private Date updateDttm;
	
	private String updateUserid;
	
	private Contract contract;
	
	private Set<RepairComplaint> repairComplaints;

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
	 * @return the contract
	 */
	public Contract getContract() {
		return contract;
	}

	/**
	 * @param contract the contract to set
	 */
	public void setContract(Contract contract) {
		this.contract = contract;
	}

	/**
	 * @return the repairComplaints
	 */
	public Set<RepairComplaint> getRepairComplaints() {
		return repairComplaints;
	}

	/**
	 * @param repairComplaints the repairComplaints to set
	 */
	public void setRepairComplaints(Set<RepairComplaint> repairComplaints) {
		this.repairComplaints = repairComplaints;
	}

	/**
	 * @return the complaintSummary
	 */
	public String getComplaintSummary() {
		return complaintSummary;
	}

	/**
	 * @param complaintSummary the complaintSummary to set
	 */
	public void setComplaintSummary(String complaintSummary) {
		this.complaintSummary = complaintSummary;
	}

		
}
