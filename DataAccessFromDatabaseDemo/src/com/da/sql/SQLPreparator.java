package com.da.sql;

import com.da.map.EntityMetaData;

public interface SQLPreparator {
	
	public String sqlSelectObject(EntityMetaData emd);
	public String sqlSaveObject(EntityMetaData emd);
	public String sqlUpdateObject(EntityMetaData emd);
	public String sqlDeleteObject(EntityMetaData emd);
}
