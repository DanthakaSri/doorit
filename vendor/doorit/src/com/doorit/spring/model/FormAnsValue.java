/**
 * 
 */
package com.doorit.spring.model;

import java.sql.Date;

/**
 * @author Anil
 *
 */
public class FormAnsValue {
	
	private long  id; // pk 
	
	private long AnsId; // fk
		
	private String value ;
	
	private long productId; // fk from prodcut not required 
	
	private long requestId ;// fk from RequestService
	
	

}
