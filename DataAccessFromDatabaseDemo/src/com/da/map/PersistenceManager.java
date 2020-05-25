package com.da.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.da.common.ConnectionFactory;
import com.da.sql.SQLPreparator;
import com.da.util.PropertiesReadFile;

public class PersistenceManager {

	private PersistenceMetadata presistenceMetadata;
	
	public PersistenceManager(PersistenceMetadata persistenceMetadata) {
		this.presistenceMetadata=persistenceMetadata;
	}
	
	public List<Object>getObject(Class<?> clazz) {
		List<Object>listobject= null;
		Connection con= null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		Object obj= null;
		EntityMetaData entityMetadata=null;
		String sql=null;
		SQLPreparator sqlpreparator= null;
		Properties props= null;
		
		listobject= new ArrayList<Object>();
		try {
			con=ConnectionFactory.newConnection();
			props=PropertiesReadFile.readProperties("com/da/util/db.properties");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listobject;
	}
}
