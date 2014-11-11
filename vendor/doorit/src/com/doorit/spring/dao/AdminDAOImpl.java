package com.doorit.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.doorit.spring.model.Option;
import com.doorit.spring.model.Person;
import com.doorit.spring.model.Product;
import com.doorit.spring.model.Question;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	
/*
	@Override
	public void addPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person saved successfully, Person Details="+p);
	}

	@Override
	public void updatePerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, Person Details="+p);
	}
*/
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listProduct() {
		System.out.println("######################## DAO ##################");
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productList = session.createQuery("from Product").list();
		for(Product p : productList){
			logger.info("Product List::"+p);
		}
		return productList;
	}
/*
	@Override
	public Person getPersonById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Person p = (Person) session.load(Person.class, new Integer(id));
		logger.info("Person loaded successfully, Person details="+p);
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
	}
*/


@Override
public void addProduct(Product p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.persist(p);
	logger.info("Prodcut saved successfully, Person Details="+p);
	
}


@Override
public Product getProductById(long id) {
	Session session = this.sessionFactory.getCurrentSession();		
	Product p = (Product) session.load(Product.class, new Long(id));
	logger.info("Product loaded successfully, Person details="+p);
	System.out.println("Product loaded successfully, Person details="+p);
	return p;
}


@Override
public void addQuestion(Product p,Question q) {
	Session session = this.sessionFactory.getCurrentSession();
	q.setProduct(p);
	session.persist(q);
	logger.info("Question saved successfully, Question Details="+q);
	System.out.println("Question saved successfully, Question Details="+q);
	
}


@Override
public List<Question> listQuestion() {
	System.out.println("######################## DAO question list ##################");
	Session session = this.sessionFactory.getCurrentSession();
	List<Question> questionList = session.createQuery("from Question").list();
	for(Question q : questionList){
		logger.info("Product List::"+q);
	}
	return questionList;
}


@Override
public void addOption(Option o, Question q) {
	Session session = this.sessionFactory.getCurrentSession();
	o.setQuestion(q);
	session.persist(o);
	logger.info("Option saved successfully, Question Details="+o);
	System.out.println("Option saved successfully, Question Details="+o);
	
	
}


@Override
public Question getQuestionById(long id) {
	Session session = this.sessionFactory.getCurrentSession();		
	Question q = (Question) session.load(Question.class, new Long(id));
	logger.info("Product loaded successfully, Person details="+q);
	System.out.println("Product loaded successfully, Person details="+q);
	return q;
}


@Override
public List<Option> listOption() {
	System.out.println("######################## DAO question list ##################");
	Session session = this.sessionFactory.getCurrentSession();
	List<Option> optionList = session.createQuery("from Option").list();
	for(Option o : optionList){
		logger.info("Product List::"+o);
	}
	return optionList;
}


}
