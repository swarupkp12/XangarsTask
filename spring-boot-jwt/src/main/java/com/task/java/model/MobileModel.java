package com.task.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MOBILE_TBL")
public class MobileModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int mobileId;
	
	@Column
    private String mobileNumber;
	
	@Column
    private String otp;
	
	@Column
    private String expireTime;
	
	@Column
    private String createdTime;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public String toString() {
		return "MobileModel [mobileId=" + mobileId + ", mobileNumber=" + mobileNumber + ", otp=" + otp + ", expireTime="
				+ expireTime + ", createdTime=" + createdTime + "]";
	}
	
	
	
	
}
