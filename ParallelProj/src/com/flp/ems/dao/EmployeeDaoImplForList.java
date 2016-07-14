package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public  class EmployeeDaoImplForList implements IemployeeDao {

	List<Employee> employees=new ArrayList<Employee>();
	List<Department> departments=new ArrayList<Department>();
	List<Project> projects=new ArrayList<Project>();
	List<Role> roles=new ArrayList<Role>();
	
	public void addEmployee(Employee emp){

	
	
	   employees.add(emp);
	   departments.add(emp.getDepartment());
	   projects.add(emp.getProject());
	   roles.add(emp.getRole());
	   System.out.println(emp);
	   
	   
	 }
	
	public void searchEmployee(int a) {
		
		for(Employee emp : employees ) 
		{
	        if(emp.getEmpid() == a){
	          System.out.println("detail found");
	        }
	        else{
	        	System.out.println("not found");
	        }
		}
		
	  
	}
    
	public void removeEmployee(int y,Employee employee){
	
		
		
		for(Employee emp : employees){
		
			if(emp.getEmpid() == y)
			{
				System.out.println("record is removed");
				employees.remove(emp);
				System.out.println(emp);
			}
		
			else{
				System.out.println("incorrect input");
			}
		}
		
	}
		
    public void getAllEmp(Employee emp){
    
    	//for(int i=0;i<((List<Employee>) emp).size() ;i++)
        //for(Employee :employees){  	
    	System.out.println(emp);
    	
        }
    }
		
		

