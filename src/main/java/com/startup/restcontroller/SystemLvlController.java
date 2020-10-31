package com.startup.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.startup.entity.SystemLevel;
import com.startup.repositories.SystemLevelRepository;

@RestController
public class SystemLvlController {

	public static final Logger logger = LoggerFactory.getLogger(SystemLvlController.class);

	@Autowired
	SystemLevelRepository systemLvlRepo;

	@RequestMapping(value = "/systemlevel", method = RequestMethod.GET)
	public ResponseEntity<?> getSystemLvl() {
		List<SystemLevel> systemLevelList = systemLvlRepo.findAll();
		return new ResponseEntity<List<SystemLevel>>(systemLevelList, new HttpHeaders(), HttpStatus.OK);
	}
}