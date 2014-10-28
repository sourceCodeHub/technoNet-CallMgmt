/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.models;

import java.util.Date;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 *       <p>
 *       This is Base Value object class which holds all the common attributes
 *       such as create & update dates and user IDs. All other VOs in tnscms
 *       domain will extend this class
 *       </p>
 */
public class BaseVO implements java.io.Serializable{
	
	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 4066073992825630908L;

	private Date createDttm;
	
	private String createUserid;
	
	private Date updateDttm;
	
	private String updateUserid;

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
