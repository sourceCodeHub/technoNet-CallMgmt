package com.technonetcmsappv0.ui;

import java.sql.SQLException;

import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.query.TableQuery;

/**
 * This class is used to connect to database
 * 
 * @author Amol
 * 
 */
public class MemberDAO {

	/*
	 * This method is used to return table specific data
	 */
	public SQLContainer createContainer(String tableName) {
		SQLContainer container = null;
		try {
			final JDBCConnectionPool pool = new SimpleJDBCConnectionPool(
					"com.mysql.jdbc.Driver",
					"jdbc:mysql://localhost:3306/mydb", "root", "admin");
			TableQuery query = new TableQuery(tableName, pool);
			container = new SQLContainer(query);
//			pool.destroy();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return container;
	}
	
	

	
}
