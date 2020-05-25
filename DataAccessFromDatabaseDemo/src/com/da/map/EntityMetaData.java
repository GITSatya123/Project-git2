package com.da.map;

import java.util.Properties;

public class EntityMetaData {

	private String pkColumn;
	private String tableName;
	private Properties colsToAttributesProps;
	
	public String getPkColumn() {
		return pkColumn;
	}
	public void setPkColumn(String pkColumn) {
		this.pkColumn = pkColumn;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Properties getColsToAttributesProps() {
		return colsToAttributesProps;
	}
	public void setColsToAttributesProps(Properties colsToAttributesProps) {
		this.colsToAttributesProps = colsToAttributesProps;
	}
	@Override
	public String toString() {
		return "EntityMetaData [pkColumn=" + pkColumn + ", tableName=" + tableName + ", colsToAttributesProps="
				+ colsToAttributesProps + "]";
	}
	
	
	
}
