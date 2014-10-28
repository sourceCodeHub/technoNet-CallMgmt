/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.models;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class object holds a single row from the database table of REPAIR_COMPLAINTS</p>
 */
public class RepairComplaintVO extends BaseVO {

	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 2411830601161064996L;
	
	private String complaintid;
	
	private String comments;

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
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
		

}
