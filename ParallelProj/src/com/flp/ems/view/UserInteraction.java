package com.flp.ems.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction {
	
	 Validate val=new Validate();
	Scanner sc=new Scanner(System.in);
	IEmployeeService empService;
	
	
	Map<String, Object> empDetails=new HashMap<String, Object>();

		public UserInteraction(){
		 empService=new EmployeeServiceImpl();
	}
	
	public void addEmployee(){
		
	
		
		System.out.println("Enter empid");
		empDetails.put("empId", sc.nextInt());
		
		System.out.println("Enter empname");
		empDetails.put("empName", sc.next());
		
		System.out.println("enter mail");
		empDetails.put("mail", sc.next());
		
		System.out.println("enter phone");
		empDetails.put("phno", sc.nextInt());
		
		System.out.println("enter address");
		empDetails.put("address", sc.next());
		
		boolean db,dj;
			
		do{
		System.out.print("Enter dob");
	    String dob=sc.next();
	    db=val.validate(dob);
	    
	    if(db){
	    	
	    	System.out.println("Valid");
	    	empDetails.put("DOB",dob );

	    	
	    }
	    else{
	    	System.out.println("Invalid");
	    }
	    
		}while(db==false);
		
		do{
	    System.out.print("Enter employee DOJ");
		String doj=sc.next();
		  dj=val.validate(doj);
				    
		    if(dj){
		    	System.out.println("Valid");
		    	empDetails.put("DOJ", doj);
		    }
		    else{
		    	System.out.println("Invalid");
		    }
			

		}while(dj==false);
	  	
	 
		/*System.out.println("enter dob");
		empDetails.put("dob", sc.next());
		boolean db= val.validate("dob");
	
		System.out.println("enter doj");
		empDetails.put("doj", sc.next());
		boolean dj= val.validate("doj");
	   
       if(db==dj){
    	   System.out.println("Validated");
       }
	
       else
       {
    	   System.out.println("Invalid date \n input the correct date");
    	   //addEmployee();
    	   
       }*/
		
        System.out.println("enter dept id");
		empDetails.put("deptId", sc.nextInt());
		
		System.out.println("enter dept name");
		empDetails.put("deptName", sc.next());

		System.out.println("enter proj id");
		empDetails.put("projId", sc.nextInt());
		
		System.out.println("enter proj name");
		empDetails.put("projName", sc.next());

		
		System.out.println("enter role id");
		empDetails.put("roleId", sc.nextInt());
		
		System.out.println("enter role name");
		empDetails.put("roleName", sc.next());

		empService.addEmployee(empDetails);
	
		
      
	}
   
	public void searchEmployee(){

		System.out.println("enter Emp_id");
	
       int a=sc.nextInt();
	     
	     empService.searchEmployee(a);
	     
		
	}
	public void removeEmployee(){
		
	    System.out.println("Do u wish to delete details?");
	    System.out.println("Enter id to delete");
	    int y=sc.nextInt();
	     
	    empService.removeEmployee(y);
	    
	
	
	}
   public void getAllEmp(){
	   empService.getAllEmp(empDetails);
   }
  




}
