package com.flp.ems.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public interface IemployeeDao {
/*
    public void addEmployee(Employee employee);
    public List<Employee> getAllEmployee();
	public Employee searchEmployee(String kinid, String empName, String mail);
	public void modifyEmployee(Map empModifiedDetails, Employee emp, int ch);
	public boolean removeEmployee(String kinid, String empName, String mail);
	*/
	
	//void AddEmployee(Employee e);
	void getAllEmployee() throws ClassNotFoundException, SQLException;
	//boolean RemoveEmployee(String name,Employee e) throws ClassNotFoundException, SQLException;
		
		
		void searchEmployee(String empName, String mail, String kinid) throws ClassNotFoundException, SQLException;

		//Employee ModifyEmployee(Map<String, Object> modify, String name, String emailid, String kinid, int ch) throws ClassNotFoundException, SQLException;

		void addEmployee(Employee employee) throws ClassNotFoundException, SQLException;
//		boolean RemoveEmployee(String name1, Employee e) throws ClassNotFoundException, SQLException;
	//	boolean RemoveEmployee(String name);


	//	boolean removeEmployee(String kinid);


	


		boolean removeEmployee(String kinid, String empName, String mail) throws ClassNotFoundException, SQLException;
		
}

