package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.my.spring.model");

		Employee emp = ioc.getBean(Employee.class);

		System.out.println(emp);

	}

}
