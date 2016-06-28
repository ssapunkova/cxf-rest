package com.zahariev.hcp.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import com.zahariev.hcp.rest.Private;
import com.zahariev.hcp.rest.Public;

public class MobileServerApplication extends Application {

	public MobileServerApplication() {
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(MOXyJsonProvider.class);
		classes.add(Private.class);
		classes.add(Public.class);

		return classes;
	}
}
