package com.cognizant.pensionmanagement.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import com.cognizant.pensionmanagement.model.PensionDetails;
import com.cognizant.pensionmanagement.repository.PensionDetailsRepository;



@Repository
public class PensionManagementDao {
	
	@Autowired
	PensionDetailsRepository repository;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PensionManagementDao.class);
	
	
	
	
	public List<PensionDetails> getAllPensionerDetails() {
		List<PensionDetails> pensioners = new ArrayList<>();
		repository.findAll().forEach(pensioner -> pensioners.add(pensioner));
		return pensioners;
	}
	
	
	
	
}
