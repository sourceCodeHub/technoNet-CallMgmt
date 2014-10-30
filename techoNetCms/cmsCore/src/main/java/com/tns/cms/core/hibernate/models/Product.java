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
 * <p>This class object holds a single row from the database table of PRODUCTS</p>
 */
public class Product{

	
	private String productid;
	
	private String productType;
	
	private String productMake;
	
	private String productModel;
	
	private String productContactName;
	
	private String productContactPhone;
	
	private String productContactEmail;
	
	private String productWebsite;
	
	private String productIsactive;
	
	private String productComments;
	
	private Date createDttm;
	
	private String createUserid;
	
	private Date updateDttm;
	
	private String updateUserid;

	/**
	 * @return the productid
	 */
	public String getProductid() {
		return productid;
	}

	/**
	 * @param productid the productid to set
	 */
	public void setProductid(String productid) {
		this.productid = productid;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the productMake
	 */
	public String getProductMake() {
		return productMake;
	}

	/**
	 * @param productMake the productMake to set
	 */
	public void setProductMake(String productMake) {
		this.productMake = productMake;
	}

	/**
	 * @return the productModel
	 */
	public String getProductModel() {
		return productModel;
	}

	/**
	 * @param productModel the productModel to set
	 */
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	/**
	 * @return the productContactName
	 */
	public String getProductContactName() {
		return productContactName;
	}

	/**
	 * @param productContactName the productContactName to set
	 */
	public void setProductContactName(String productContactName) {
		this.productContactName = productContactName;
	}

	/**
	 * @return the productContactPhone
	 */
	public String getProductContactPhone() {
		return productContactPhone;
	}

	/**
	 * @param productContactPhone the productContactPhone to set
	 */
	public void setProductContactPhone(String productContactPhone) {
		this.productContactPhone = productContactPhone;
	}

	/**
	 * @return the productContactEmail
	 */
	public String getProductContactEmail() {
		return productContactEmail;
	}

	/**
	 * @param productContactEmail the productContactEmail to set
	 */
	public void setProductContactEmail(String productContactEmail) {
		this.productContactEmail = productContactEmail;
	}

	/**
	 * @return the productWebsite
	 */
	public String getProductWebsite() {
		return productWebsite;
	}

	/**
	 * @param productWebsite the productWebsite to set
	 */
	public void setProductWebsite(String productWebsite) {
		this.productWebsite = productWebsite;
	}

	/**
	 * @return the productIsactive
	 */
	public String getProductIsactive() {
		return productIsactive;
	}

	/**
	 * @param productIsactive the productIsactive to set
	 */
	public void setProductIsactive(String productIsactive) {
		this.productIsactive = productIsactive;
	}

	/**
	 * @return the productComments
	 */
	public String getProductComments() {
		return productComments;
	}

	/**
	 * @param productComments the productComments to set
	 */
	public void setProductComments(String productComments) {
		this.productComments = productComments;
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
