package com.cbs4.impl;

import java.util.Map;

import org.hibernate.boot.registry.StandardServiceInitiator;
import org.hibernate.service.spi.ServiceRegistryImplementor;

public class ServiceInitiator implements StandardServiceInitiator<JdbcDriverManagerConectionProviderImpl> {

	@Override
	public Class<JdbcDriverManagerConectionProviderImpl> getServiceInitiated() {
		// TODO Auto-generated method stub
		return JdbcDriverManagerConectionProviderImpl.class;
	}

	@Override
	public JdbcDriverManagerConectionProviderImpl initiateService(Map cfgmap, ServiceRegistryImplementor arg1) {
		// TODO Auto-generated method stub
		return new JdbcDriverManagerConectionProviderImpl();
	}

}
