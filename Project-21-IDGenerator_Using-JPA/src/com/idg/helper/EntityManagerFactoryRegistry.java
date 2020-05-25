package com.idg.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {
		
		private static EntityManagerFactory mysqlEntityManagerFactory;
		private static EntityManagerFactory oracleEntityManagerFactory;
		

//		public synchronized static EntityManagerFactory getMysqlEntityManagerFactory() {
//			if(mysqlEntityManagerFactory==null) {
//				 mysqlEntityManagerFactory=Persistence.createEntityManagerFactory("Mysql-units");
//			 }	
//			return mysqlEntityManagerFactory;
//		}

		public synchronized static EntityManagerFactory getOracleEntityManagerFactory() {
			if(oracleEntityManagerFactory==null) {
				oracleEntityManagerFactory=Persistence.createEntityManagerFactory("Oracle-units");
			}
			return oracleEntityManagerFactory;
		}
		
		public static void EntityManagerFactories() {
			if(mysqlEntityManagerFactory!=null) {
				mysqlEntityManagerFactory.close();
				mysqlEntityManagerFactory=null;
			}
			
			if(oracleEntityManagerFactory!=null) {
				oracleEntityManagerFactory.close();
				oracleEntityManagerFactory=null;
			}
		}
		 
}
