/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.domain.models;

/**
 * @author Sahil
 * 
 * @Date Oct 28, 2014
 * 
 * <p>This class holds a single row from database table of CODE_DECODE</p>
 */
public class CodeDecodeVO extends BaseVO {
	
	/**
	 * Auto generated UID
	 */
	private static final long serialVersionUID = -4496024353620220552L;

	private String primaryCode;
	
	private String secondaryCode;
	
	private String primaryDecode;
	
	private String secondaryDecode;
	
	private String description;

	/**
	 * @return the primaryCode
	 */
	public String getPrimaryCode() {
		return primaryCode;
	}

	/**
	 * @param primaryCode the primaryCode to set
	 */
	public void setPrimaryCode(String primaryCode) {
		this.primaryCode = primaryCode;
	}

	/**
	 * @return the secondaryCode
	 */
	public String getSecondaryCode() {
		return secondaryCode;
	}

	/**
	 * @param secondaryCode the secondaryCode to set
	 */
	public void setSecondaryCode(String secondaryCode) {
		this.secondaryCode = secondaryCode;
	}

	/**
	 * @return the primaryDecode
	 */
	public String getPrimaryDecode() {
		return primaryDecode;
	}

	/**
	 * @param primaryDecode the primaryDecode to set
	 */
	public void setPrimaryDecode(String primaryDecode) {
		this.primaryDecode = primaryDecode;
	}

	/**
	 * @return the secondaryDecode
	 */
	public String getSecondaryDecode() {
		return secondaryDecode;
	}

	/**
	 * @param secondaryDecode the secondaryDecode to set
	 */
	public void setSecondaryDecode(String secondaryDecode) {
		this.secondaryDecode = secondaryDecode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	/** 
	  * @see java.lang.Object#equals(java.lang.Object) method is overridden
	  */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CodeDecodeVO)) {
			return false;
		}
		CodeDecodeVO other = (CodeDecodeVO) obj;
		if (primaryCode == null) {
			if (other.primaryCode != null) {
				return false;
			}
		} else if (!primaryCode.equals(other.primaryCode)) {
			return false;
		}
		if (secondaryCode == null) {
			if (other.secondaryCode != null) {
				return false;
			}
		} else if (!secondaryCode.equals(other.secondaryCode)) {
			return false;
		}
		return true;
	}


}
