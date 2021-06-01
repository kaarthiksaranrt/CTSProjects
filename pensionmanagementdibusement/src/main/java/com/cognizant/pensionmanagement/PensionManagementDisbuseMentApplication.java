package com.cognizant.pensionmanagement;

import java.sql.SQLException;
import java.util.List;

import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.cognizant.pensionmanagement.dao.PensionManagementDao;
import com.cognizant.pensionmanagement.model.PensionDetails;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.cognizant.pensionmanagement.repository"})
public class PensionManagementDisbuseMentApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(PensionManagementDisbuseMentApplication.class);
	private static PensionManagementDao pensionManagementDao;
	
	
	
	private static void testGetAllPensioners() {
		LOGGER.info("Start");
		List<PensionDetails> pensioners= pensionManagementDao.getAllPensionerDetails();
		for(PensionDetails i : pensioners) {
		LOGGER.debug("Pensioners={}", i);
		}
		LOGGER.info("End");
	}
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PensionManagementDisbuseMentApplication.class, args);
		pensionManagementDao = context.getBean(PensionManagementDao.class);
		testGetAllPensioners();
		
		
		
	}

}
