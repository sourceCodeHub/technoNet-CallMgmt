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
 *       This Enum defines the typical type of error codes this application
 *       could get. This will help for debugging purpose. Additional error codes
 *       could be added later on.
 *       </p>
 */
public enum TnsCmsErrorCode {

	ALERT_EXCEPTION("100CMS", "Exception thrown while processing alerts."), 
	REPORT_EXCEPTION("200CMS", "Exception thrown while generating report."), 
	CORE_EXCEPTION("300CMS", "Exception thrown while doing core operations."), 
	DATABSE_CORE_EXCEPTION("301CMS", "Exception thrown while doing database operations."), 
	WEB_EXCEPTION("400CMS", "Exception thrown while processing web page request."),
	UNIDENTIFIED_EXCEPTION("500CMS", "Unidentified exception thrown.");

	/**
	 * Auto Generated ID
	 */
	private static final long serialVersionUID = 4704054336522099705L;

	private String errorCode;
	private String errorDescription;

	TnsCmsErrorCode(String errorCode, String errorDescription) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public String getErrorDescription() {
		return this.errorDescription;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("ErrorCode : ").append(errorCode)
				.append("; Description : ").append(errorDescription).toString();
	}

}
