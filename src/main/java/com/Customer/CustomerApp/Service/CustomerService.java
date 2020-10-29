package com.Customer.CustomerApp.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Customer.CustomerApp.dao.ICustomer;
import com.Customer.CustomerApp.dto.Customer;
@Service
public class CustomerService implements ICustomerService{
	@Autowired
	private ICustomer dao;
	
	@Override
	@Transactional
	public Customer add(Customer customer) {
		return dao.register(customer);
	}

	public Customer update(long id,String name) {
		Customer cus=dao.findById(id);
		cus.setName(name);
		return dao.updateName(cus);
	}

}
