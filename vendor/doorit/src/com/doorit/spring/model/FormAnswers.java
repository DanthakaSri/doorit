/**
 * 
 */
package com.doorit.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Anil
 *
 */
@Entity
@Table(name="form_question")
public class FormAnswers {
	
	@Id
	@Column(name="ans_id")
	@GeneratedValue
	private long id; // pk 
	
	private long productId; // fk from prodcut not required 
	
	private long requestId ;// fk from RequestService
	
	
	@Column(name = "name")
	String name;
	
	@Column(name = "type")
	String type; // check box , drop down 
	
	@Column(name = "displayOrder")
	int displayOrder ;
	
	
	
	
	
	
}
