/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.hibernate.dao.impl;

import java.util.List;

import com.tns.cms.core.constants.HibernateConstants;
import com.tns.cms.core.exception.TnsCmsException;
import com.tns.cms.core.hibernate.dao.ISelectCmsDAO;
import com.tns.cms.core.hibernate.models.CodeDecode;

/**
 * @author Sahil
 * 
 * @Date Nov 2, 2014
 * 
 *       <p>
 *       This class house all the specialized methods to fetch data from the
 *       database using hibernate queries
 *       </p>
 */
public class SelectCmsDAO extends BaseCmsDAO implements ISelectCmsDAO{
	
	/**
	 * This method returns all the rows in CODE_DEOCDE table
	 * @return
	 * @throws TnsCmsException
	 */
	public List<CodeDecode> getAllCodeDecodes() throws TnsCmsException{
		
		return queryForList(HibernateConstants.CODE_DECODE_SLECT_ALL_HQL_QUERY, null, 0, new CodeDecode());
		
	}

}
