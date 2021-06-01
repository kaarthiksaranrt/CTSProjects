/***********************************************************************************************************
 * This class CustomerDetails is the value object that must be binded to loanEligibility view
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE 
 *
************************************************************************************************************/
package com.cognizant.pensionmanagement.model;

import javax.validation.constraints.Size;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class PensionDetails {

	/// DO NOT CHANGE THE VARIABLE NAMES OR DATA TYPES OR ACCESS SPECIFIERS
	
	
	//@Size(min = 4, max = 30, message = "size must be between 4 and 30")
	@Id
	@Column
	@NotNull(message = "must not be null")
	private Long aadharNumber;
	
	@Column
	@NotNull(message = "must not be null")
	private String name;
	
	@Column
	@NotNull(message = "must not be null")
	private  Date dob;
	
	@Column
	@NotNull(message = "must not be null")
	private String pan;
	
	@Column
	@NotEmpty(message = "must not be empty")
	private String selfOrFamilyPension;
	
	@Column
	@NotNull(message = "must not be null")
	private Double salary;
	
	@Column
	@NotNull(message = "must not be null")
	private Double allowances;
	
	@Column
	@NotNull(message = "must not be null")
	private Integer accountNumber;
	
	@Column
	@NotNull(message = "must not be null")
	private String bankName;
	
	@Column
	@NotNull(message = "must not be null")
	private String bankType;
	
	public PensionDetails() {}

	public PensionDetails(@NotNull(message = "must not be null") Long aadharNumber,
			@NotNull(message = "must not be null") String name, @NotNull(message = "must not be null") Date dob,
			@NotNull(message = "must not be null") String pan,
			@NotEmpty(message = "must not be empty") String selfOrFamilyPension,
			@NotNull(message = "must not be null") Double salary,
			@NotNull(message = "must not be null") Double allowances,
			@NotNull(message = "must not be null") Integer accountNumber,
			@NotNull(message = "must not be null") String bankName,
			@NotNull(message = "must not be null") String bankType) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.dob = dob;
		this.pan = pan;
		this.selfOrFamilyPension = selfOrFamilyPension;
		this.salary = salary;
		this.allowances = allowances;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.bankType = bankType;
	}

	public Long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getSelfOrFamilyPension() {
		return selfOrFamilyPension;
	}

	public void setSelfOrFamilyPension(String selfOrFamilyPension) {
		this.selfOrFamilyPension = selfOrFamilyPension;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getAllowances() {
		return allowances;
	}

	public void setAllowances(Double allowances) {
		this.allowances = allowances;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	@Override
	public String toString() {
		return String.format(
				"PensionDetails [aadharNumber=%s, name=%s, dob=%s, pan=%s, selfOrFamilyPension=%s, salary=%s, allowances=%s, accountNumber=%s, bankName=%s, bankType=%s]",
				aadharNumber, name, dob, pan, selfOrFamilyPension, salary, allowances, accountNumber, bankName,
				bankType);
	}

	
	

	
	

	

	

}
