package com.technonetcmsappv0.dao;

import java.sql.SQLException;

import com.example.technonetcmsappv0.MemberDAO;
import com.vaadin.data.Item;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.util.sqlcontainer.SQLContainer;

/**
 * This class is used to connect to database and update customer demographics
 * information in database
 * 
 * @author Amol
 * 
 */
public class UpdateCustomerDemographics {

	MemberDAO databaseConnection = new MemberDAO();

	public void insertCustomerDemographics(FieldGroup fieldGroup) {
		SQLContainer container = databaseConnection
				.createContainer("customer_demographics");
		try {
			
			Object itemId = container.addItem();
			Item item = container.getItem(itemId);
			
//			fieldGroup = new FieldGroup(item);			
			fieldGroup.commit();
			container.commit();
		} catch (CommitException | UnsupportedOperationException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
