package com.task.java.service;



import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.task.java.dao.CustomerPolicyInfoDao;
import com.task.java.model.CustomerPolicyInfoModel;
import com.task.java.pojo.CustomerPolicyInfoPojo;

@Service
public class CustomerPolicyInfoService {

	private static final Logger logger = LogManager.getLogger(CustomerPolicyInfoService.class);
	
	@Autowired
	private CustomerPolicyInfoDao custDao;
	
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	
	public CustomerPolicyInfoModel saveUser(CustomerPolicyInfoPojo user){
		CustomerPolicyInfoModel savetodb=null;
		try {
		logger.info("$$$$$ saveUser of CustomerPolicyInfoService class $$$$$");
		CustomerPolicyInfoModel newUser = new CustomerPolicyInfoModel();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setEmail(user.getEmail());
		newUser.setMobileNumber(user.getMobileNumber());
		newUser.setPancard(user.getPancard());
		newUser.setPolicyNumber(user.getPolicyNumber());
		newUser.setCustomerId(user.getCustomerId());
		newUser.setInsuredName(user.getInsuredName());
		newUser.setDob(user.getDob());
		newUser.setPremiumMode(user.getPremiumMode());
		newUser.setPolicyStatus(user.getPolicyStatus());
		newUser.setPolicyInsuranceDate(user.getPolicyInsuranceDate());
		newUser.setContactNumberLastUpdated(user.getContactNumberLastUpdated());
		newUser.setEmailAddressLastUpdated(user.getEmailAddressLastUpdated());
		newUser.setWhatsappOptInStatus(user.getWhatsappOptInStatus());
		newUser.setOutstandingPayout(user.getOutstandingPayout());
		newUser.setUnclaimedAmount(user.getUnclaimedAmount());
		newUser.setNeftRegistration(user.getNeftRegistration());
		newUser.setLastPremiunmPaid(user.getLastPremiunmPaid());
		savetodb=custDao.save(newUser);
		}
		catch(Exception e) {
			logger.error("$$$$$ (Exception) ERROR in ~saveUser~ CustomerPolicyInfoService $$$$$" + e);
		}
		return savetodb;
	}
	
	//to find the detail policy details using id
	public CustomerPolicyInfoModel getPolicyById(int id){
		logger.info("$$$$$ getPolicyById of CustomerPolicyInfoService class $$$$$");
	return custDao.findById(id).orElse(null);
	}

	//find the policy details using customername
	public CustomerPolicyInfoModel getUserByUsername(String username) {
		// TODO Auto-generated method stub
		logger.info("$$$$$ getUserByUsername of CustomerPolicyInfoService class $$$$$");
		return custDao.findByUsername(username);
		
	}

	
	//mobileNumberUpdate
	public CustomerPolicyInfoModel updateMobileNumber(CustomerPolicyInfoPojo cust) {
		// TODO Auto-generated method stub
		logger.info("$$$$$ updateMobileNumber of CustomerPolicyInfoService class $$$$$");
		CustomerPolicyInfoModel existingPolicy=custDao.findById(cust.getId()).orElse(null);
		System.out.println("kkkkkkkkkkkkkkkkkkkk"+cust.getMobileNumber());
		existingPolicy.setMobileNumber(cust.getMobileNumber());
		System.out.println("mmmmmmmmmmmmmmmmmmmmm"+existingPolicy.getMobileNumber());
		return custDao.save(existingPolicy);
	}
	
	
	
	    //emailUpdate
		public CustomerPolicyInfoModel updatePolicyEmail(CustomerPolicyInfoPojo cust) {
			// TODO Auto-generated method stub
			logger.info("$$$$$ updatePolicyEmail of CustomerPolicyInfoService class $$$$$");
			CustomerPolicyInfoModel existingPolicy=custDao.findById(cust.getId()).orElse(null);
			existingPolicy.setEmail(cust.getEmail());
			return custDao.save(existingPolicy);
		}

		
		//pancardupdate
		public CustomerPolicyInfoModel updateCustPancard(CustomerPolicyInfoPojo cust) {
			// TODO Auto-generated method stub
			logger.info("$$$$$ updateCustPancard of CustomerPolicyInfoService class $$$$$");
			CustomerPolicyInfoModel existingPolicy=custDao.findById(cust.getId()).orElse(null);
			existingPolicy.setPancard(cust.getPancard());
			return custDao.save(existingPolicy);
		}

}
