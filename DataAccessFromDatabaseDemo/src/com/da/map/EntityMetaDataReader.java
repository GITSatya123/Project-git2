package com.da.map;

import java.util.Properties;

import com.da.util.PropertiesReadFile;

public class EntityMetaDataReader {
	
	public static EntityMetaData metadataReader(String PropertiesFileName) throws Exception {
		
		Properties props= null;
		
		props= PropertiesReadFile.readProperties(PropertiesFileName);
		
		EntityMetaData emd= new EntityMetaData();
		emd.setPkColumn(props.getProperty("pkColumn"));
		emd.setTableName(props.getProperty("tableName"));
		
		props.remove("pkColumn");
		props.remove("tableName");
		
		emd.setColsToAttributesProps(props);
		return emd;
		
	
	}
	
}
