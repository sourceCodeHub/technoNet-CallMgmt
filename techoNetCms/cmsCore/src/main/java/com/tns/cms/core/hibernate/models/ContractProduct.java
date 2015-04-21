/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.hibernate.models;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class maps a single row from database table of CONTRACT_PRODUCT</p>
 */
public class ContractProduct implements Serializable{
	
	/**
	 * Auto generated ID
	 */
	private static final long serialVersionUID = -9211532859819326840L;

	private String contractid;
	
	private String productid;
	
	private String contractProductDetails;
	
	private Date createDttm;
	
	private String createUserid;
	
	private Product product;

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
	 * @return the contractProductDetails
	 */
	public String getContractProductDetails() {
		return contractProductDetails;
	}

	/**
	 * @param contractProductDetails the contractProductDetails to set
	 */
	public void setContractProductDetails(String contractProductDetails) {
		this.contractProductDetails = contractProductDetails;
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
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

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

	
}
