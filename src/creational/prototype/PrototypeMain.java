package com.pattern.creational.prototype;

import java.util.List;

public class PrototypeMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("employee::");
		Employee employee = new Employee();
		employee.loadData();
		employee.getEmployeeList().stream().forEach(System.out::println);
		
		System.out.println("e1::");
		Employee e1 = (Employee) employee.clone();
		e1.getEmployeeList().add("Spring");
		e1.getEmployeeList().stream().forEach(System.out::println);
		
		System.out.println("e2::");
		Employee e2 = (Employee) e1.clone();
		e2.getEmployeeList().remove("Spring");
		e2.getEmployeeList().stream().forEach(System.out::println);
	}
}
