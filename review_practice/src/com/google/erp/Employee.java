package com.google.erp;

public class Employee {
	
	//속성변수 선언
	private int emp_no;
	private String emp_name;
	
	//생성자 선언
	public Employee(int emp_no, String emp_name) {
		 this.emp_no = emp_no;
		 this.emp_name = emp_name;
	}
	
	//메소드 선언
	public int getEmp_no() {
		return emp_no;
	}
	
	public String getEmp_name() {
		return emp_name;
	}
	
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	
	
}
