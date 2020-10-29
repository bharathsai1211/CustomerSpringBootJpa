package com.Customer.CustomerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Customer.CustomerApp.ui.Appui;

@SpringBootApplication
public class CustomerAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(CustomerAppApplication.class, args);
		Appui app=context.getBean(Appui.class);
		app.runui();
		context.close();
	}

}
