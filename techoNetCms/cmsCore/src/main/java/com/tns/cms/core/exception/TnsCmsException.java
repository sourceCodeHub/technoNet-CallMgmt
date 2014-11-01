/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.exception;

/**
 * @author Sahil
 * 
 * @Date Nov 2, 2014
 * 
 *       <p>
 *       This is a custom class for the application. All the runtime or checked
 *       exceptions will be wrapped in this class and bubbled up to the user for
 *       debugging purpose
 *       </p>
 */
public class TnsCmsException extends Exception {

	/**
	 * Auto Generated ID
	 */
	private static final long serialVersionUID = 4704054336522099705L;
	
	/**
	 * Unidentified exception set by default if not specified otherwise
	 */
	private TnsCmsErrorCode errorDetails  = TnsCmsErrorCode.UNIDENTIFIED_EXCEPTION;
	
	/**
	 * Constructor # 1
	 * @param String errorMessage
	 * @param Throwable
	 * @param TnsCmsErrorCode
	 */
	public TnsCmsException(String errorMessage, Throwable cause, TnsCmsErrorCode errorDetails) {
		super(errorMessage, cause);
		this.errorDetails = errorDetails;		 
	}
	
	/**
	 * Constructor # 2
	 * @param Throwable
	 * @param TnsCmsErrorCode
	 */
	public TnsCmsException(Throwable cause, TnsCmsErrorCode errorDetails) {
		super(cause);
		this.errorDetails = errorDetails;		 
	}
		
	/**
	 * <p>
	 * returns the exception stack trace in more readable form
	 * </p>
	 * 
	 * 
	 * @see java.lang.Throwable#toString() method is overridden
	 */
	@Override
	public String toString() {

		return (new StringBuilder().append("\n------------------")
				.append("Exception Information =>").append("\n")
				.append(this.errorDetails.toString())
				.append("\n------------------").append(this.toString()))
				.toString();

	}

}
