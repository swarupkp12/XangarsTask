package com.task.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPTION_TBL")
public class OptionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int optionId;
	
	@Column
    private String mobileNumber;
	
	@Column
    private String policyNumber;
	
	@Column
    private String optiondate;

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getOptiondate() {
		return optiondate;
	}

	public void setOptiondate(String optiondate) {
		this.optiondate = optiondate;
	}

	@Override
	public String toString() {
		return "OptionModel [optionId=" + optionId + ", mobileNumber=" + mobileNumber + ", policyNumber=" + policyNumber
				+ ", optiondate=" + optiondate + "]";
	}
	
	
    
	
	
}
