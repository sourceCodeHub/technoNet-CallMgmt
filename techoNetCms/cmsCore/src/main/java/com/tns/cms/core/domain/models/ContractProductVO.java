/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.domain.models;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class maps a single row from database table of CONTRACT_PRODUCTS</p>
 */
public class ContractProductVO extends BaseVO {
	
	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = 279138755598959065L;

	private String contractid;
	
	private String productdid;
	
	private String contractProductDetails;

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
	 * @return the productdid
	 */
	public String getProductdid() {
		return productdid;
	}

	/**
	 * @param productdid the productdid to set
	 */
	public void setProductdid(String productdid) {
		this.productdid = productdid;
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
	
	

}
