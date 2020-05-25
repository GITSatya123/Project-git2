package com.cbs4.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.exception.spi.Configurable;
import org.hibernate.service.spi.Startable;

@SuppressWarnings("serial")
public class JdbcDriverManagerConectionProviderImpl implements ConnectionProvider,Configurable,Startable {
	
	
	public void stop() {
		System.out.println("JdbcDriverManagerConectionProviderImpl.stop()");
	}
	@Override
	public void start() {
		try {
			Class.forName("driverClassName");
			//con= DriverManager.getConnection("jdbc:mysql://localhost:3306/location");
		}catch(Exception e) {
			throw new RuntimeException(e);
		}		
	}
	String driverClassName;
	String url;
	String username;
	String password;
	
	@Override
	public void configure(Properties props) throws HibernateException {
		this.driverClassName=props.getProperty("hibernate.connection.driverClassName");
		this.url=props.getProperty("hibernate.connecton.url");
		this.username=props.getProperty("hibernate.connection.username");
		this.password=props.getProperty("hibernate.connection.password");
		
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		Connection con= null;
		try {
			con=DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
		throw new RuntimeException(e);
		}
		
		return con;
	}
	
	
	
	@Override
	public void closeConnection(Connection con) throws SQLException {
		if(con !=null&&con.isClosed()==false) {
			con.close();
		}
		
	}

	

	@Override
	public boolean supportsAggressiveRelease() {
		
		return true;
	}

	@Override
	public boolean isUnwrappableAs(Class arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	


	

	
	
	
	
	

	
	
}
