package com.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> list;
	
	public Employee() {
		list = new ArrayList<>();
	}
	
	public Employee(List<String> list) {
		this.list = list;
	}
	
	public void loadData() {
		list.add("Bhaskar");
		list.add("Java");
		list.add("J2ee");
	}
	
	public List<String> getEmployeeList() {
		return list;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		this.getEmployeeList().stream().forEach(s->{temp.add(s);});
		return new Employee(temp);
	}
}
