/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.constants;

/**
 * @author Sahil
 * 
 * @Date Oct 30, 2014
 * 
 *       <p>
 *       This class contains all the public static final constants which will be
 *       used to refer to the code values of CODE_DECODE table
 *       </p>
 */
public final class CodeDecodeConstants {

	/**
	 * Type of customer to be displayed in the drop down. example values :
	 * Purchaser / Buyer / in Contact / Others
	 */
	public static final String TYPE_OF_CUSTOMER = "TOC";

	/**
	 * Type of product to be displayed in the drop down. example values : EPABX
	 * / Security Systems / CCTV / Bio matrix / Telecom Products / Networking
	 * Products / Computer Hardware / Fax / Telephones / Other
	 */
	public static final String TYPE_OF_PRODUCT = "TOP";

	/**
	 * Name of the company of a product AKA make of the product. example values
	 * : Matrix / Siemens / Crystal / Accord / Hikvision / CP Plus / BeeTel /
	 * Panasonic / Others
	 */
	public static final String MAKE_OF_PRODUCT = "MOP";

	/**
	 * periodic terms for contract payments. example values Annually / Half
	 * Yearly / Quarterly / Monthly / Call Basis
	 */
	public static final String CONTRACT_PAYMENT_TERMS = "CPT";

	/**
	 * Type of contract . example values : Annually / Half Yearly / Quarterly /
	 * Monthly / Call Basis
	 */
	public static final String TYPE_OF_CONTRACT = "TCR";

	/**
	 * Type of complaint . example values : in contract / ad-hoc
	 */
	public static final String TYPE_OF_COMPLAINT = "TCM";

	/**
	 * Status of complaint . example values : New / Assigned / WIP / Resolved
	 */
	public static final String STATUS_OF_COMPLAINT = "SCM";

	/**
	 * Region of Customer. example values : Mumbai / Pune / Maharashtra / Others
	 */
	public static final String REGION_OF_CUSTOMER = "ROC";

	/**
	 * Type of Entity values, this is solely tracked for technical purpose in
	 * the code i.e. to . example values : contract / complaint / customer/
	 * product / employee / user / email
	 */
	public static final String TYPE_OF_ENTITY = "TOE";

	/**
	 * Type of application Users. example values : Admin / Customer / Viewer /
	 * Reports
	 */
	public static final String TYPE_OF_USER = "TOU";

}
