package com.da.common;

import java.util.Properties;

public class DBConstant {

	public static Properties storeproperties= new Properties();
	
	static {
		
		storeproperties.put("storeno", "storeNo");
		storeproperties.put("store_First_Name", "storeFirstName");
		storeproperties.put("store_Last_Name", "storeLastName");
		storeproperties.put("mobno", "mobNo");
		storeproperties.put("designation", "designation");
		storeproperties.put("mail_id", "mail_id");
		storeproperties.put("address_line1", "addressLine1");
		storeproperties.put("address_line2", "addressLine2");
		storeproperties.put("city", "city");
		storeproperties.put("state", "state");
		storeproperties.put("zip","zip");
		storeproperties.put("country", "country");
	}
	
	public static Properties staffproperties= new Properties();
	
	static {
		staffproperties.put("staffno", "staffNo");
		staffproperties.put("staff_First_Name", "staffFirstName");
		staffproperties.put("staff_Last_Name", "staffLastName");
		staffproperties.put("mobno", "mobNo");
		staffproperties.put("gender", "gender");
		staffproperties.put("designation", "designation");
		staffproperties.put("mail_id", "mail_id");
		staffproperties.put("address_line1", "addressLine1");
		staffproperties.put("address_line2", "addressLine2");
		staffproperties.put("city", "city");
		staffproperties.put("state", "state");
		staffproperties.put("zip","zip");
		staffproperties.put("country", "country");
	}
}
