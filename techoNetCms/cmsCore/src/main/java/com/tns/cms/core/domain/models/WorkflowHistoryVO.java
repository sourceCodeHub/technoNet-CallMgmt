/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.domain.models;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class holds a single row from a database table of WORKFLOW_HISTORY</p>
 */
public class WorkflowHistoryVO extends BaseVO {

	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = -4142332347592564090L;
	
	private String entityid;
	
	private String entityType;
	
	private String remarks;

	/**
	 * @return the entityid
	 */
	public String getEntityid() {
		return entityid;
	}

	/**
	 * @param entityid the entityid to set
	 */
	public void setEntityid(String entityid) {
		this.entityid = entityid;
	}

	/**
	 * @return the entityType
	 */
	public String getEntityType() {
		return entityType;
	}

	/**
	 * @param entityType the entityType to set
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
