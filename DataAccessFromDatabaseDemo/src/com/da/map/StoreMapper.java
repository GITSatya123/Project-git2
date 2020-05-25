package com.da.map;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.da.bean.Store;

public class StoreMapper {

	public static Store StoreOfMapResultSetRecordToStore(ResultSet rs) throws SQLException {
		
		Store store = null;
		
		
		store.setStoreNo(rs.getString("storeNo"));
		store.setStoreName(rs.getString("storeName"));
		store.setContactNo(rs.getString("contactNo"));
		store.setAddressLine1(rs.getString("addressLine1"));
		store.setAddressLine1(rs.getString("addressLine2"));
		store.setCity(rs.getString("city"));
		store.setState(rs.getString("state"));
		store.setZip(rs.getString("zip"));
		store.setCountry(rs.getString("country"));
		
		store=StoreOfMapResultSetRecordToStore(rs);
		return store;
	}
	
}
