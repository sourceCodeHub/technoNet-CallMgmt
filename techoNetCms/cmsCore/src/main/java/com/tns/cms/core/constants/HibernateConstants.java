/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.constants;

/**
 * @author Sahil
 * 
 * @Date Nov 2, 2014
 * 
 * <p>This class houses all the constants related to hibernate queries and other configurations</p>
 */
public final class HibernateConstants {
	
	/**
	 * This is the maximum number of results any get query will fetch, unless this values is over ridden locally
	 */
	public static final int GLOBAL_QUERY_MAX_RESULTS = 1000;
	
	/**
	 * An HQL query to select and fetch all the CODE_DECODE table rows in CodeDecode Objects
	 */
	public static final String CODE_DECODE_SLECT_ALL_HQL_QUERY = "FROM CodeDecode";
	

}
