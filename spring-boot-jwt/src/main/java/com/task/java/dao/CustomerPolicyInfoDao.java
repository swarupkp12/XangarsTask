package com.task.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.java.model.CustomerPolicyInfoModel;

@Repository
public interface CustomerPolicyInfoDao extends JpaRepository<CustomerPolicyInfoModel, Integer> {
	
	CustomerPolicyInfoModel findByUsername(String username);

	long countByPancard(String string);

	
	
}