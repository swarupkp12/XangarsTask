package com.task.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TBL")
public class ProductModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
	
	@Column
    private String productName;
	
	@Column
    private String productDetails;
	
	@Column
    private String productLaunchDate;
	
	@Column
    private String productEnddate;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductLaunchDate() {
		return productLaunchDate;
	}

	public void setProductLaunchDate(String productLaunchDate) {
		this.productLaunchDate = productLaunchDate;
	}

	public String getProductEnddate() {
		return productEnddate;
	}

	public void setProductEnddate(String productEnddate) {
		this.productEnddate = productEnddate;
	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", productName=" + productName + ", productDetails="
				+ productDetails + ", productLaunchDate=" + productLaunchDate + ", productEnddate=" + productEnddate
				+ "]";
	}
	
	
	
	
}
