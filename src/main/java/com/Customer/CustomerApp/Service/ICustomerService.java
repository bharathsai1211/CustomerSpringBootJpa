package com.Customer.CustomerApp.Service;

import com.Customer.CustomerApp.dto.Customer;

public interface ICustomerService {
	public Customer add(Customer customer);
	public Customer update(long l, String string);
	

}
