package com.cognizant.pensionmanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.pensionmanagement.model.PensionDetails;
import com.cognizant.pensionmanagement.service.PensionManagementService;
import com.cognizant.pensionmanagement.service.exception.PensionDetailsNotFoundException;


@RestController
@RequestMapping(path = "/PensionDetailsByAadhar")
public class PensionDetailsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PensionDetailsController.class);

	@Autowired
	private PensionManagementService pensionManagementService;

	@GetMapping
	public List<PensionDetails> getAllPensionerDetails() {
		LOGGER.info("Start");

		List<PensionDetails> details = pensionManagementService.getAllPensionerDetails();

		LOGGER.info("End");

		return details;
	}

	@GetMapping("/{Id}")
	public PensionDetails getDetailsByAadharId(@PathVariable long Id) throws PensionDetailsNotFoundException
	{
		LOGGER.info("Start");
		PensionDetails detail = pensionManagementService.getByAadharId(Id);
		LOGGER.info("End");
		return detail;
	}
	
	@PutMapping
	public PensionDetails updatePensionerDetails(@RequestBody @Valid PensionDetails pensioner) throws PensionDetailsNotFoundException {
		LOGGER.info("Start");

		pensionManagementService.updatePensionerDetails(pensioner);
	
		LOGGER.info("End");
		return pensioner;
	}
	
	@PostMapping
	public PensionDetails addPensioner(@RequestBody @Valid PensionDetails pensioner)
	{

		LOGGER.debug("PensionDetails:{}",pensioner);
		pensionManagementService.addPensioner(pensioner);
		
		return pensioner;
	}
	
	@DeleteMapping("/{id}")
	public PensionDetails deletePensionerDetails(@PathVariable("id") Long id ) throws PensionDetailsNotFoundException {
		
		LOGGER.info("Start");

		PensionDetails detail = pensionManagementService.deletePensionerDetails(id);
		
		LOGGER.info("End");
		return detail;
	}

}