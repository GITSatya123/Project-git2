package com.da.sql;

import com.da.map.EntityMetaData;

public class MySQLPreparotorImpl implements SQLPreparator {

	@Override
	public String sqlSelectObject(EntityMetaData emd) {
		boolean isFirst= true;
		StringBuffer buffer= null;
		
		//SELECT store_no,store_nm,contact_no,email_address,addressline_1,addressline_2,city,state,zip,country FROM STORE;
		
		buffer= new StringBuffer();
		buffer.append("SELECT ");
		for(Object col :emd.getColsToAttributesProps().keySet()) {
			col=col.toString();
			if(isFirst) {
				buffer.append(col);
				isFirst=false;
			}
			else {
				buffer.append(",").append(col);
			}
		}
		buffer.append(" FROM ").append(emd.getTableName());
		return buffer.toString();
	}

	@Override
	public String sqlSaveObject(EntityMetaData emd) {
		boolean isFirst=true;
		StringBuffer buffer= null;
		
		//INSERT INTO STORE( store_no,store_nm,contact_no,email_address,addressline_1,addressline_2,city,state,zip,country) 
		//VALUES(?,?,?,?,?,?,?,?,?,?);
		buffer= new StringBuffer();
		buffer.append(" INSERT INTO ").append(emd.getTableName()).append("(");
		
		for(Object col:emd.getColsToAttributesProps().keySet()) {
		col=col.toString();
		
		if(isFirst) {
			buffer.append(col);
			isFirst=false;
		}
		else {
			buffer.append(",").append(col);
		}
	}
		buffer.append(") VALUES (");
		isFirst=true;
		for(int i=0;i<emd.getColsToAttributesProps().keySet().size();i++) {
			if(isFirst) {
				buffer.append("?");
				isFirst=false;
			}
			else {
				buffer.append(",").append("?");
			}
		}
		buffer.append(")");
		return buffer.toString();
	}

	@Override
	public String sqlUpdateObject(EntityMetaData emd) {
		boolean isFirst=true;
		StringBuffer buffer= null;
		
		//UPDATE STORE SET store_no=?,store_nm=?,contact_no=?,email_address=?,addressline_1=?,addressline_2=?,city=?,state=?,zip=?,
		//country=? WHERE STORE_NO=?;
		
		buffer= new StringBuffer();
		buffer.append(" UPDATE ").append(emd.getTableName()).append(" SET ");
		
		for(Object col:emd.getColsToAttributesProps().keySet()) {
			col=col.toString();
			if(col.equals(emd.getPkColumn())) {
				continue;
			}
			if(isFirst) {
				buffer.append(col).append("=?");
			}
			else {
				buffer.append(",").append(col).append("=?");
			}
		}
		buffer.append("WHERE");
		buffer.append(emd.getPkColumn()).append("=?");
		return buffer.toString();
	}

	@Override
	public String sqlDeleteObject(EntityMetaData emd) {
		
		StringBuffer buffer= null;
		buffer= new StringBuffer();
		
		//DELETE FROM STOTE WHERE STORE_NO=?
		
		buffer.append("DELETE FROM").append(emd.getTableName());
		buffer.append("WHERE").append(emd.getPkColumn()).append("=?");
		return buffer.toString();
	}

}
