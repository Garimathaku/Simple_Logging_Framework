package com.uc.slf;

import com.uc.slf.bean.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SlfApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SlfApplication.class, args);


		// Retrieving EmployeeBean from ApplicationContext
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		System.out.println(employee.getEmployeeDetails());
	}
}
