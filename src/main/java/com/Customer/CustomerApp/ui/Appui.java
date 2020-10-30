package com.Customer.CustomerApp.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Customer.CustomerApp.Service.ICustomerService;
import com.Customer.CustomerApp.dto.Customer;
@Component
public class Appui {
	@Autowired
	private ICustomerService service;
	public void runui()
	{
		Customer customer=new Customer();
		customer.setId(100L);
		customer.setName("bharath");
		Customer customer1=new Customer();
		customer1.setId(110L);
		customer1.setName("ram");
		service.add(customer);
		service.add(customer1);
		//service.update(100L,"Krish");
	}

}
