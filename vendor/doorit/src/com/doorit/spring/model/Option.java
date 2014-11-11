/**
 * 
 */
package com.doorit.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Anil
 *
 */
@Entity
@Table(name="OPTION")
public class Option implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opt_id")
	@GeneratedValue
	private long  optId; // pk 
	
	@Column(name="opt_desc")
	private String optDesc; // 

	public Option() {
		
	}
	
	@ManyToOne
	@JoinColumn(name="que_id")
	private Question question;

	public long getOptId() {
		return optId;
	}

	public void setOptId(long optId) {
		this.optId = optId;
	}

	public String getOptDesc() {
		return optDesc;
	}

	public void setOptDesc(String optDesc) {
		this.optDesc = optDesc;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

		

}
