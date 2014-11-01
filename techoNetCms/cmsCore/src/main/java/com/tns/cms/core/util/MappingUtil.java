/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.util;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import com.tns.cms.core.domain.models.CodeDecodeVO;
import com.tns.cms.core.hibernate.models.CodeDecode;

/**
 * @author Sahil
 * 
 * @Date Nov 2, 2014
 * 
 * <p>This class methods have responsibilities of mapping from one class object to another class object</p>
 */
public class MappingUtil {
	
	private static Logger LOGGER = Logger.getLogger(MappingUtil.class.getName());
	
	/**
	 * This method maps values from CodeDecode to CodeDecodeVO
	 * @param codeDecode
	 * @return Mapped Object if the mapping is successful or null if there is an exception
	 */
	public static CodeDecodeVO mapToCodeDecodeVO(CodeDecode codeDecode){
		CodeDecodeVO codeDecodeVO = null;
		
		try{
			
		if(codeDecode!=null){
			codeDecodeVO= new CodeDecodeVO();
		}
		
		BeanUtils.copyProperties(codeDecode, codeDecodeVO);
		
		}catch(BeansException be){
			LOGGER.error("Error while mapping CodeDecode Object : ", be);
		}
		
		return codeDecodeVO;
	}

}
