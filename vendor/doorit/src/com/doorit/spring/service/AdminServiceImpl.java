package com.doorit.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doorit.spring.dao.AdminDAO;
import com.doorit.spring.dao.PersonDAO;
import com.doorit.spring.model.Option;
import com.doorit.spring.model.Person;
import com.doorit.spring.model.Product;
import com.doorit.spring.model.Question;

@Service
public class AdminServiceImpl implements AdminService {
	
	private AdminDAO adminDAO;
	
		
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	@Transactional
	public void addProduct(Product p) {
		this.adminDAO.addProduct(p);
		
	}


	@Override
	@Transactional
	public List<Product> listProduct() {
		return this.adminDAO.listProduct();
	}

	@Override
	@Transactional
	public Product getProductById(long id) {
			return this.adminDAO.getProductById(id);
	}

	@Override
	@Transactional
	public void addQuestion(Product p ,Question q) {
		this.adminDAO.addQuestion(p, q);
		
	}

	@Override
	@Transactional
	public List<Question> listQuestion() {
		return this.adminDAO.listQuestion();
	}

	@Override
	@Transactional
	public void addOption(Option o, Question q) {
		this.adminDAO.addOption(o, q);
		
	}

	@Override
	@Transactional
	public Question getQuestionById(long id) {
		return this.adminDAO.getQuestionById(id);
	}

	@Override
	@Transactional
	public List<Option> listOption() {
		return this.adminDAO.listOption();
		
	}





	
}
