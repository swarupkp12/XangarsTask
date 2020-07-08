package com.task.java.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

@Entity
@Table(name = "CUST_POL_TBL")
public class CustomerPolicyInfoModel {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private String mobileNumber;
	
	@Column
	//@JsonIgnore
	private String pancard;
	
	@Column
	private String policyNumber;
	
	@Column
	private String customerId;
	
	@Column
	private String insuredName;
	
	@Column
	private String dob;
	
	@Column
	private String premiumMode;
	
	@Column
	private String policyStatus;
	
	@Column
	private String policyInsuranceDate;
	
	@Column
	private String contactNumberLastUpdated;
	
	@Column
	private String emailAddressLastUpdated;
	
	@Column
	private String whatsappOptInStatus;
	
	@Column
	private String productName;
	
	@Column
	private String productId;
	
	@Column
	private String reinvestmentApplicable;
	
	@Column
	private String outstandingPayout;
	
	@Column
	private String unclaimedAmount;
	
	@Column
	private String neftRegistration;
	
	@Column
	private String lastPremiunmPaid;
	
	
	
	

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

	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "CustomerPolicyInfoModel [id=" + id + ", username=" + username + ", password=" + password + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", pancard=" + pancard + ", policyNumber=" + policyNumber
				+ ", customerId=" + customerId + ", insuredName=" + insuredName + ", dob=" + dob + ", premiumMode="
				+ premiumMode + ", policyStatus=" + policyStatus + ", policyInsuranceDate=" + policyInsuranceDate
				+ ", contactNumberLastUpdated=" + contactNumberLastUpdated + ", emailAddressLastUpdated="
				+ emailAddressLastUpdated + ", whatsappOptInStatus=" + whatsappOptInStatus + ", productName="
				+ productName + ", productId=" + productId + ", reinvestmentApplicable=" + reinvestmentApplicable
				+ ", outstandingPayout=" + outstandingPayout + ", unclaimedAmount=" + unclaimedAmount
				+ ", neftRegistration=" + neftRegistration + ", lastPremiunmPaid=" + lastPremiunmPaid + "]";
	}
	
	
	
	
	

}