package com.da.map;

import java.util.Map;
import java.util.Properties;

public class PersistenceMetadata {
	
	Properties propertiesMetadata;
	Map<Class<?>, EntityMetaData> entityMetadataMap;
	
	public PersistenceMetadata(Properties propertiesMetadata, Map<Class<?>,EntityMetaData> entityMetadataMap) {
		
		this.propertiesMetadata=propertiesMetadata;
		this.entityMetadataMap=entityMetadataMap;
	}
	public String getDriver() {
		return propertiesMetadata.getProperty("driver");
	}
	public String getUrl() {
		return propertiesMetadata.getProperty("url");
	}
	public String getUsername() {
		return propertiesMetadata.getProperty("username");
	}
	public String getPassword() {
		return propertiesMetadata.getProperty("password");
	}
	public String getSqlPreparator() {
		return propertiesMetadata.getProperty("sqlPreparator");
	}
}
