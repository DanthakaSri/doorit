package com.doorit.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @param args
 * This class will hold the all product provided by door it .
 * @author Anil Patel
 * 08/11/2014
 */

@Entity
@Table(name = "PRODUCT")
public class Product implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_id")
	@GeneratedValue
	private long productId; // pk
	
	@Column(name="product_name",nullable = false, length = 1000)
	String productName;
	
	
	@Column(name="product_desc")
	String productDesc;
	
	@OneToMany(mappedBy = "product")
	private List<Question> question;
	
		
	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	
	
}
