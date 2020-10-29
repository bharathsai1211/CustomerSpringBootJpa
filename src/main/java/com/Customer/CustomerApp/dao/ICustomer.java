package com.Customer.CustomerApp.dao;

import com.Customer.CustomerApp.dto.Customer;

public interface ICustomer {
	public Customer register(Customer Customer);
	
	public Customer updateName(Customer Customer);
	public Customer findById(long i);
}
