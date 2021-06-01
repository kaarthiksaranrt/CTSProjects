package com.cognizant.pensionmanagement.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.pensionmanagement.dao.PensionManagementDao;
import com.cognizant.pensionmanagement.model.PensionDetails;
import com.cognizant.pensionmanagement.repository.PensionDetailsRepository;
import com.cognizant.pensionmanagement.service.exception.PensionDetailsNotFoundException;

@Service
public class PensionManagementService {
	
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PensionManagementService.class);

	@Autowired
	private PensionManagementDao pensionDao;
	
	private List<PensionDetails> pensioners = pensionDao.getAllPensionerDetails();
	
	
	
	

	 
}