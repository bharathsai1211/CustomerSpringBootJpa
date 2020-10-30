package com.Customer.CustomerApp.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.Customer.CustomerApp.dto.Customer;
@Repository
public class Customerdao implements ICustomer {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Customer register(Customer Customer) {
		
		entityManager.persist(Customer);
		return Customer;
	}

	
	@Override
	public Customer updateName(Customer customer) {
		
		return entityManager.merge(customer);
	}


	@Override
	public Customer findById(long i) {
		
		return entityManager.find(Customer.class, i);
	}
	
	

}
