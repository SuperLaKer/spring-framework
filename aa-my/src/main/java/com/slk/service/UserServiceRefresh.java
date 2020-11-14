package com.slk.service;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class UserServiceRefresh {
	public void sayHi(){
		System.out.println("userServiceRefresh hi...");
	}
}
