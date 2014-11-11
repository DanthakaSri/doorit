
package com.doorit.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Anil
 *
 */
@Entity
@Table(name="QUESTION")
public class Question implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="que_id")
	@GeneratedValue
	private long queId; // pk 
	
	@Column(name = "que_desc", length=100)
	String queDesc;
	
	@Column(name = "que_type" , length=100)
	String queType; // check box , drop down 
	
		
	public Question() {
		
	}
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@OneToMany(mappedBy = "question")
	private List<Option> option;
	
	public long getQueId() {
		return queId;
	}

	public void setQueId(long queId) {
		this.queId = queId;
	}

	public String getQueDesc() {
		return queDesc;
	}

	public void setQueDesc(String queDesc) {
		this.queDesc = queDesc;
	}

	public String getQueType() {
		return queType;
	}

	public void setQueType(String queType) {
		this.queType = queType;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
		
}
