/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.tns.cms.core.domain.models.CodeDecodeVO;
import com.tns.cms.core.exception.TnsCmsException;
import com.tns.cms.core.hibernate.dao.impl.SelectCmsDAO;
import com.tns.cms.core.hibernate.models.CodeDecode;

/**
 * @author Sahil
 * 
 * @Date Nov 2, 2014
 * 
 *       <p>
 *       This class provides the utility methods for fetching data from
 *       CODE_DECODE table in the database
 *       </p>
 */
public final class CodeDecodeUtil {
		
	//TODO : Method to fetch data from DB and store in a MAP 
	
	//TODO : Method to return a list of CocdeDecodeVO when Primary Code is passed
	
	private static Logger LOGGER = Logger.getLogger(CodeDecodeUtil.class.getName());
	
	private static SelectCmsDAO selectCmsDAO = new SelectCmsDAO();
	
	/**
	 * A static final map which gets loaded at the time of context loading to
	 * store the primary decode as key and List of codeDecodeVO object as value
	 */
	private static Map<String,List<CodeDecodeVO>> CODE_DECODE_MAP;
	
	
	public List<CodeDecodeVO> getListForPrimaryCode(String primaryCode){
		//TODO
		getAllCodeDecodes();
		return null;
	}
	
	
	/**
	 * <p>
	 * A Method to get all the CODE DECODES in a convenient format which will be
	 * useful to show in Drop Downs
	 * </p>
	 * 
	 * @return
	 */
	private static final Map<String,List<CodeDecodeVO>> getAllCodeDecodes(){
		
		if(CODE_DECODE_MAP==null){
			CODE_DECODE_MAP = new HashMap<String,List<CodeDecodeVO>>();
			try {
				List<CodeDecode> codeDecodeRows = selectCmsDAO.getAllCodeDecodes();
				
				buildCodeDecodeMap(CODE_DECODE_MAP,codeDecodeRows);
				
			} catch (TnsCmsException e) {        	
	        	LOGGER.error("An exception while loading CodeDecode rows !!",e);
	        }
			
			return CODE_DECODE_MAP;
			
		}else{
			return CODE_DECODE_MAP;
		}
		
	}
	
	/**
	 * <p>
	 * This method creates multiple lists and adds those to a map with key as
	 * the primary code of the CodeDecode table row
	 * </p>
	 * 
	 * @param targetMap
	 * @param sourceList
	 */
	private static void buildCodeDecodeMap(Map<String,List<CodeDecodeVO>> targetMap, List<CodeDecode> sourceList){
		
		if(sourceList!=null && !sourceList.isEmpty()){
			
			for(CodeDecode codeDecode : sourceList){
				
				if(codeDecode!=null){
					
					CodeDecodeVO codeDecodeVO = MappingUtil.mapToCodeDecodeVO(codeDecode);
					
					List<CodeDecodeVO> primaryCodeList = targetMap.get(codeDecode.getPrimaryCode());
					
					if(primaryCodeList==null){
						primaryCodeList = new ArrayList<CodeDecodeVO>();
						primaryCodeList.add(codeDecodeVO);
						targetMap.put(codeDecode.getPrimaryCode(), primaryCodeList);
					}else if(primaryCodeList!=null && !primaryCodeList.contains(codeDecodeVO)){						
						primaryCodeList.add(codeDecodeVO);
						targetMap.put(codeDecode.getPrimaryCode(), primaryCodeList);
					}
						
					}
				}
			}
			
			
		}

}
