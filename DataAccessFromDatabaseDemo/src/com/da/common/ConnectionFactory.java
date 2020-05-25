package com.da.common;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private static InputStream is= null;
	
	static {
		is=ConnectionFactory.class.getClassLoader().getResourceAsStream("com/da/util/db.proporties");
		
	}
	
	public static Connection newConnection() throws IOException,ClassNotFoundException,SQLException {
		Connection con= null;
		Properties props= null;
		is=ConnectionFactory.class.getClassLoader().getResourceAsStream("com/da/util/db.proporties");
		
		props= new Properties();
		props.load(is);
		
		Class.forName(props.getProperty("driver"));
		con=DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),props.getProperty("password"));
		return con;
	}

}
