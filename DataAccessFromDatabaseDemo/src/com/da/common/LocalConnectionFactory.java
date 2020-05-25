package com.da.common;

import java.io.InputStream;
import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class LocalConnectionFactory {

private static InputStream is= null;
	
	static {
		is=LocalConnectionFactory.class.getClassLoader().getResourceAsStream("com/da/util/db.proporties");
		
	}
	public Connection getPooledConnection() throws Exception {
		InitialContext ic=null;
		DataSource ds=null;
		Connection con=null;
		//create connection between javaapp and jndi
		ic= new InitialContext();
		//get datasource obj through lookup operation
		ds=(DataSource) ic.lookup("DsJndi");
		//grt pooled jdbc con
		con=ds.getConnection();
		return con;
	}
}
