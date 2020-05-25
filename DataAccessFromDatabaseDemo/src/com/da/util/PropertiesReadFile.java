package com.da.util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReadFile {

	/*public static Properties readProperties(String propertiesFileName, boolean flag ) throws Exception {
		Properties props= null;
		props= new Properties();
		props.load(PropertiesReadFile.class.getClassLoader().getResourceAsStream(propertiesFileName));
		
		if(flag==false) {
			props.remove("pkColumn");
			props.remove("tableName");
		}
		return props;
	}*/
	public static Properties readProperties(String PropertiesFileName) throws IOException {
		Properties props=null;
		props=new Properties();
		props.load(PropertiesReadFile.class.getClassLoader().getResourceAsStream(PropertiesFileName));
		return props;
	}
	
	
}
