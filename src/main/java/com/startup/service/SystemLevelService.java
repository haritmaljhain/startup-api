package com.startup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.entity.SystemLevel;
import com.startup.repositories.SystemLevelRepository;

/**
 * 
 * @author harit.kumar
 * @Service annotation used to declare the class as a Service class which holds the business logic.
 */

@Service
public class SystemLevelService {

	@Autowired
	SystemLevelRepository repository;
	
	public SystemLevel getCorporateDetails() {
		
		
		
		
		
		return null ;
	}
}
