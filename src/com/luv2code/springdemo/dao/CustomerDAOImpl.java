package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject the session factory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override

	public List<Customer> getCustomers() {
		//get the session
		Session session = sessionFactory.getCurrentSession();
		
		//create a query
		Query<Customer> theQuery = session.createQuery("from Customer order by lastName", Customer.class);
		
		//execute a query
		List<Customer> customers = theQuery.getResultList();
		
		//return the result
		return customers;
		
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session session = sessionFactory.getCurrentSession();
	//	session.beginTransaction();
		session.save(theCustomer);
	//	session.getTransaction().commit();
		
	}

	@Override
	public Customer getCustomer(int theId) {
		Session session = sessionFactory.getCurrentSession();
		
		System.out.println("GETTING");
		Customer theCustomer = session.get(Customer.class, theId);
		
		return theCustomer;
	}

}
