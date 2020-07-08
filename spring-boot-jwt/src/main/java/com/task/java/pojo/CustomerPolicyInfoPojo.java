package com.task.java.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;





public class CustomerPolicyInfoPojo implements Serializable{
	private int id;
	private String username;
	private String password;
	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",message="Please Enter valid emailid")
	private String email;
	@Pattern(regexp="^((?!(0))[0-9]{10})",message="Please Enter valid mobile number")
	private String mobileNumber;
	@Pattern(regexp="^[A-Z]{5}[0-9]{4}[A-Z]{1}",message="Please Enter valid Pancard")
	private String pancard;
	private String policyNumber;
	private String customerId;
	private String insuredName;
	private String dob;
	private String premiumMode;
	private String policyStatus;
	private String policyInsuranceDate;
	private String contactNumberLastUpdated;
	private String emailAddressLastUpdated;
	private String whatsappOptInStatus;
	private String productName;
	private String productId;
	private String reinvestmentApplicable;
	private String outstandingPayout;
	private String unclaimedAmount;
	private String neftRegistration;
	private String lastPremiunmPaid;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPremiumMode() {
		return premiumMode;
	}

	public void setPremiumMode(String premiumMode) {
		this.premiumMode = premiumMode;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPolicyInsuranceDate() {
		return policyInsuranceDate;
	}

	public void setPolicyInsuranceDate(String policyInsuranceDate) {
		this.policyInsuranceDate = policyInsuranceDate;
	}

	public String getContactNumberLastUpdated() {
		return contactNumberLastUpdated;
	}

	public void setContactNumberLastUpdated(String contactNumberLastUpdated) {
		this.contactNumberLastUpdated = contactNumberLastUpdated;
	}

	public String getEmailAddressLastUpdated() {
		return emailAddressLastUpdated;
	}

	public void setEmailAddressLastUpdated(String emailAddressLastUpdated) {
		this.emailAddressLastUpdated = emailAddressLastUpdated;
	}

	public String getWhatsappOptInStatus() {
		return whatsappOptInStatus;
	}

	public void setWhatsappOptInStatus(String whatsappOptInStatus) {
		this.whatsappOptInStatus = whatsappOptInStatus;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getReinvestmentApplicable() {
		return reinvestmentApplicable;
	}

	public void setReinvestmentApplicable(String reinvestmentApplicable) {
		this.reinvestmentApplicable = reinvestmentApplicable;
	}

	public String getOutstandingPayout() {
		return outstandingPayout;
	}

	public void setOutstandingPayout(String outstandingPayout) {
		this.outstandingPayout = outstandingPayout;
	}

	public String getUnclaimedAmount() {
		return unclaimedAmount;
	}

	public void setUnclaimedAmount(String unclaimedAmount) {
		this.unclaimedAmount = unclaimedAmount;
	}

	public String getNeftRegistration() {
		return neftRegistration;
	}

	public void setNeftRegistration(String neftRegistration) {
		this.neftRegistration = neftRegistration;
	}

	public String getLastPremiunmPaid() {
		return lastPremiunmPaid;
	}

	public void setLastPremiunmPaid(String lastPremiunmPaid) {
		this.lastPremiunmPaid = lastPremiunmPaid;
	}
	
	
	
}