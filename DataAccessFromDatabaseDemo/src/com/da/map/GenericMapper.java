package com.da.map;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Properties;

public class GenericMapper {
	
	public static Object mapRowToObject(ResultSet rs, String entityClassName  , Properties colsToAttributesProps) throws Exception {
	
	 
	/*Class<?> clazz=null;
	Object obj= null;
	String columnValue=null;
	String attributeName= null;
	String setterName= null;
	
	clazz=Class.forName(entityClassName);
	obj=clazz.newInstance();
	
	for(Object colName:colsToAttributesProps.keySet()) {
		
		attributeName=colsToAttributesProps.getProperty((String) colName);
		columnValue=rs.getString((String) colName);
		setterName="set"+ (String.valueOf(attributeName.charAt(0)).toUpperCase()+attributeName.substring(1, attributeName.length()));
		
		Method method=clazz.getDeclaredMethod(setterName, new Class [] {String.class});
		method.invoke(obj, new Object [] {columnValue});
		
		}
		return obj;*/
	
		Class<?> entityClassObject=null;
		Object entityObject=null;
		//String columnName=null;
		String attributeName= null;
		String setterName= null;
		String columnValue=null;
		
		entityClassObject=Class.forName(entityClassName);
		entityObject=entityClassObject.newInstance();
		
		for(Object colName:colsToAttributesProps.keySet()) {
			attributeName=colsToAttributesProps.getProperty((String)colName);
			columnValue=rs.getString((String)colName);
			setterName="set"+ (String.valueOf(attributeName.charAt(0)).toUpperCase()+attributeName.substring(1,attributeName.length()));
			
			Method method= entityClassObject.getDeclaredMethod(setterName, new Class[] {String.class});
			method.invoke(entityObject, new Object[] {columnValue});
		}
		return entityObject;
	}
	
	public static PreparedStatement mapObjectToSavePreparedStatement(Connection con,String sql,EntityMetaData emd,Object obj) {
		PreparedStatement pstmt= null;
		Class<?>clazz= null;
		String attributeName= null;
		String columnValue= null;
		String getterName= null;
		Method method= null;
		int colCount=1;
		
		
			clazz=obj.getClass();
		try {
			pstmt= con.prepareStatement(sql);
			Map colsToAttribute=emd.getColsToAttributesProps();
			
			for(Object colName:colsToAttribute.keySet()) {
				attributeName=(String)colsToAttribute.get(colName);
				getterName="get"+(String.valueOf(attributeName.charAt(0)).toUpperCase()+attributeName.substring(1,attributeName.length()));
				method=clazz.getDeclaredMethod(getterName, null);
				pstmt.setString(colCount, (String)method.invoke(obj, null));
				colCount++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pstmt;
}

}