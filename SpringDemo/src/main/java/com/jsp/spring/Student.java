package com.jsp.spring;

public class Student {
	private int id;
	private Employee employee;
	
	
	public Employee getEmployee() {
		return employee;
	}

//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

	Student(Employee employee)
	{
		this.employee=employee;
	}

	public int getId() {
		return id;
	}
	


//	public void setId(int id) {
//		this.id = id;
//	}
	
	
}
