package com.my.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employee;
import com.my.spring.rep.EmployeeDao;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
		EmployeeDao edao = ioc.getBean("edao", EmployeeDao.class);
		Employee emp1 = new Employee(2, "yash raj", "Male", 88000);
//		edao.saveEmployee(emp1);
//		edao.updateEmployee(emp1);
//		edao.deleteEmployee(2);
		List<Employee> allEmp = edao.getAllEmp();
		System.out.println(allEmp);

	}

}
