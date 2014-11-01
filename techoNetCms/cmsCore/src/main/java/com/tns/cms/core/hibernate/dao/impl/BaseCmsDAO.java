/**
 * Copyrights reserved by TechnoNet Solutions Pvt. Ltd. 2014
 */
package com.tns.cms.core.hibernate.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tns.cms.core.constants.HibernateConstants;
import com.tns.cms.core.exception.TnsCmsErrorCode;
import com.tns.cms.core.exception.TnsCmsException;

/**
 * @author Sahil
 * @param <T>
 * 
 * @Date Nov 2, 2014
 * 
 *       <p>
 *       This class has generalized methods to deal with the database. These
 *       methods will be used in the specific DAO classes
 *       </p>
 */
public class BaseCmsDAO {
	
	private static Logger LOGGER = Logger.getLogger(BaseCmsDAO.class.getName());
	
	private SessionFactory sessionFactory;
	
	/**
	 * 
	 * @param query
	 * @param parameters : name & value of the search criteria 
	 * @param localMaxResults : If passed as zero the max fetch limit will be considered as GLOBAL_QUERY_MAX_RESULTS  
	 * @param : clazz - Class of the expected list e.g. Customer.class 
	 * @return : List of type clazz
	 * @throws TnsCmsException 
	 */	
	protected final <T> List<T> queryForList(String query, Map<String, Object> parameters, int localMaxResults,T clazz) throws TnsCmsException {
		
        try {
        	
            final Query hqlQuery = getCurrentSession().createQuery(query).setReadOnly(true);

            /*
             * To bypass the queries where we want to select all
             */
			if (parameters != null && !parameters.isEmpty()) {
				for (Map.Entry<String, Object> entry : parameters.entrySet()) {
					hqlQuery.setParameter(entry.getKey(), entry.getValue());
				}
			}
            
            if(localMaxResults>0){
            	hqlQuery.setMaxResults(localMaxResults);
            }else{
            	hqlQuery.setMaxResults(HibernateConstants.GLOBAL_QUERY_MAX_RESULTS);
            }            
            
            return (List<T>) hqlQuery.list();
            
        } catch (HibernateException e) {
        	
        	LOGGER.error("An Exception occurred in BaseCmsDAO.queryForList, returning null list of "+clazz.getClass().getName()+" !!");
        	
        	throw new TnsCmsException(e, TnsCmsErrorCode.DATABSE_CORE_EXCEPTION);
        } 
    }
	
	
	/**
	 * 	
	 * @return
	 */
	protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
