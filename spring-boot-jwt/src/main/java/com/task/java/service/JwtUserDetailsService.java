package com.task.java.service;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.task.java.dao.CustomerPolicyInfoDao;
import com.task.java.model.CustomerPolicyInfoModel;


@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private CustomerPolicyInfoDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	
	
	
	
	  @Override 
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { 
	  CustomerPolicyInfoModel user = userDao.findByUsername(username);
	  if (user == null)
	      { 
		       throw new UsernameNotFoundException("User not found with username: " + username);
		    }
	  return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(), new ArrayList<>()); 
	  }
	 
	 
	
	
	
	
	 
	 
	
	
	
	
		
}