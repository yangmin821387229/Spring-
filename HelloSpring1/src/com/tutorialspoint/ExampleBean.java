package com.tutorialspoint;

import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Properties Set");
		
	}

}
