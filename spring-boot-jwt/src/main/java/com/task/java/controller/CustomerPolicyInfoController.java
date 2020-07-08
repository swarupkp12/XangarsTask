package com.task.java.controller;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Optional;
import java.util.SplittableRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.java.dao.CustomerPolicyInfoDao;
import com.task.java.model.CustomerPolicyInfoModel;
import com.task.java.pojo.CustomerPolicyInfoPojo;
import com.task.java.service.CustomerPolicyInfoService;


@RestController
public class CustomerPolicyInfoController {
	
	private static final Logger logger = LogManager.getLogger(CustomerPolicyInfoController.class);
	
	@Autowired
	private CustomerPolicyInfoService custService;
	@Autowired
	private CustomerPolicyInfoDao custDao;

	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		logger.info("$$$$$ print hello woorld of CustomerPolicyInfoController class $$$$$");
		System.out.println("hi");
		return "Hello World";
	}
	
	
	
	
	
	@GetMapping("/userById/{id}")
	public String findByid(@PathVariable int id) {
		logger.info("$$$$$ print findByid of CustomerPolicyInfoController class $$$$$");
		CustomerPolicyInfoModel dAOUser=custService.getPolicyById(id);
		
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr=null;
		try {
			jsonStr = Obj.writeValueAsString(dAOUser);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return jsonStr;
		
	}
	
	
	
	@GetMapping("/userByName/{username}")
	public String findUsername(@PathVariable String username) {
		logger.info("$$$$$ print findUsername of CustomerPolicyInfoController class $$$$$");
		CustomerPolicyInfoModel dAOUser=custService.getUserByUsername(username);
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr=null;
		try {
			jsonStr = Obj.writeValueAsString(dAOUser);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonStr;
		
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/updateMobilenumber", method = RequestMethod.PUT)
	public ResponseEntity<String> updatePolicyMobile(@RequestBody CustomerPolicyInfoPojo cust){
		logger.info("$$$$$ print updatePolicyMobile of CustomerPolicyInfoController class $$$$$");
	     CustomerPolicyInfoModel custPolicy=custService.updateMobileNumber(cust);
		return new ResponseEntity<>("Mobile number updated successfully", HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/updateEmail", method = RequestMethod.PUT)
	public ResponseEntity<String> updatePolicyEmail(@RequestBody CustomerPolicyInfoPojo cust){
		logger.info("$$$$$ print updatePolicyEmail of CustomerPolicyInfoController class $$$$$");
	     CustomerPolicyInfoModel custPolicy=custService.updatePolicyEmail(cust);
		return new ResponseEntity<>("Email updated successfully", HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/updateCustomerPancard", method = RequestMethod.PUT)
	public ResponseEntity<String> updateCustPancard(@RequestBody CustomerPolicyInfoPojo cust){
		logger.info("$$$$$ print updateCustPancard of CustomerPolicyInfoController class $$$$$");
	     CustomerPolicyInfoModel custPolicy=custService.updateCustPancard(cust);
		return new ResponseEntity<>("Pancard updated successfully", HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/sendOtpToMobileNumber/{mobileNumber}")
	public String sendOtpToMobileNumber(@PathVariable String mobileNumber) {
		logger.info("$$$$$ print sendOtpToMobileNumber of CustomerPolicyInfoController class $$$$$");
		
		  String otpStr = CustomerPolicyInfoController.generateOtp(5);
		  System.out.println("Genearated Otp=" + otpStr);
		  CustomerPolicyInfoController.sendSMS(otpStr,mobileNumber);
		 
		return "your otp is"+otpStr+"\n"+"your status code is 1003-OTP Sent";
		
	}
	
	
	  public static void sendSMS(String otpStr, String mobileNumber) { 
		  try { 
			  String apiKey = "apiKey="+"t6rBDBfrVFo-AryOWXj5IQDFp8cC0KrLQ5pVUlWuMl";
	  String message = "&message="+URLEncoder.encode("Your OTP is "+otpStr,"UTF-8"); 
	  String numbers = "&numbers="+mobileNumber; 
	  String apiURL ="https://api.textlocal.in/send/?"+apiKey+message+numbers; 
	  URL url=new URL(apiURL); 
	  URLConnection connection=url.openConnection();
	  connection.setDoOutput(true);
	  
	  BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
	  
	  String line=""; 
	  StringBuilder sb=new StringBuilder();
	  
	  while((line=reader.readLine())!=null) { 
		  sb.append(line).append("\n"); 
		  }
	  
	  System.out.println(sb.toString()); 
	  } catch(Exception e) {
	  e.printStackTrace();
	  } 
   }
	  
	  
	  
	  public static String generateOtp(int otpLength) { 
		  SplittableRandom splittableRandom = new SplittableRandom();
	  StringBuffer sb = new StringBuffer();
	  for(int i=0;i<otpLength;i++) {
		  sb.append(splittableRandom.nextInt(0, 10)); 
		  }
	  return sb.toString(); 
	  }
	 

}