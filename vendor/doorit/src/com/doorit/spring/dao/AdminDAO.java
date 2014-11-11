package com.doorit.spring.dao;

import java.util.List;

import com.doorit.spring.model.Option;
import com.doorit.spring.model.Person;
import com.doorit.spring.model.Product;
import com.doorit.spring.model.Question;

public interface AdminDAO {

	public List<Product> listProduct();
	public List<Question> listQuestion();
	public List<Option> listOption();
	public void addProduct(Product p);
	public Product getProductById(long id);
	public void addQuestion( Product p ,Question q);
	public void addOption(Option o ,Question q);
	public Question getQuestionById(long id);
	/*
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	*/
}
