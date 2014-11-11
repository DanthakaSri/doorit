/**
 * 
 */
package com.doorit.spring.model;

import java.sql.Date;

/**
 * @author aryahi
 *
 */
public class RequestService {
	
	private long id; // request_id 
	
	private String UserId; // fk from user
	
	private String prodcutId ; // fk from product

	private String quotesId;
	
	private String VendorID;
	
	String column4;
	
	String column5;
	
	String status ;
	
	Date lastUpdatedDate ;
	

}
