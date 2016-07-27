package com.flp.ems.dao;


//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/*import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
*/


import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;


public class EmployeeDaoImplForDb implements IemployeeDao {
/*	private String empid;
	private String kinid;
	private  String empname;
	private String mail;
	private String phno;
	private String address;
	private String dob;
	private String doj;
	private String names;
	Employee e = new Employee();*/

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	private String b,d,f,x,y,z,m,n,u,v,l;
	private int a,c,e;

	
	
	public void addEmployee(Employee employee)throws ClassNotFoundException, SQLException {

		

		Class.forName(driver);
		Connection dbConnection;
		dbConnection = (Connection) DriverManager.getConnection(url);
		String query ="insert into Empployee(empId,kinid,mail,empName,phno,dob,doj,address,deptId,projId,roleId) values(?,?,?,?,?,?,?,?,?,?,?)";
		java.sql.PreparedStatement preparedStmt = dbConnection.prepareStatement(query);
		preparedStmt.setString(1, employee.getEmpid());
		preparedStmt.setString(2, employee.getKinid());
		preparedStmt.setString(3, employee.getMail());
		preparedStmt.setString(4, employee.getEmpname());
		preparedStmt.setString(5, employee.getPhno());
		preparedStmt.setString(6, employee.getDob());
		preparedStmt.setString(7, employee.getDoj());
		preparedStmt.setString(8, employee.getAddress());
		preparedStmt.setInt(9, employee.getDeptId());
		preparedStmt.setInt(10, employee.getProjId());
		preparedStmt.setInt(11, employee.getRoleId());

 
		
		
		
		preparedStmt.execute();
		

	}


	
	public void getAllEmployee() throws ClassNotFoundException, SQLException {
		
		 Class.forName(driver);
		 Connection dbConnection;
		 dbConnection=(Connection)DriverManager.getConnection(url);
		 java.sql.Statement stmt = dbConnection.createStatement();
		    java.sql.ResultSet rs = stmt.executeQuery("select * from Empployee inner join Department on Empployee.deptId=Department.deptId inner join Role on Empployee.roleId=Role.roleId inner join Project on Empployee.projId=Project.projId");
		    while (rs.next()) {
		    	 x = rs.getString("empid"); 
		    	 y = rs.getString("empname"); 
		    	 z = rs.getString("kinid"); 
		    	 m = rs.getString("mail"); 
		    	 n = rs.getString("phno"); 
		    	 u = rs.getString("dob"); 
		    	 v = rs.getString("doj"); 
		    	 l = rs.getString("address"); 
		    	 a = rs.getInt("deptId");
		    	 b = rs.getString("deptName");
		    	 c = rs.getInt("projId");
		    	 d = rs.getString("projName");
		    	 e = rs.getInt("roleId");
		    	 f = rs.getString("roleName");
		         System.out.println("empid:"+x+"\tempname:"+y+"\tkinid:"+z+"\tmail:"+m+"\tphno:"+n+"\tdob:"+u+"\tdoj:"+v+"\taddress:"+l+"\tdeptId"+a+"\tdeptName"+b+"\tprojId"+c+"\tprojName"+d+"\troleId"+e+"\troleName"+f);
		    }
	}

	
	public boolean removeEmployee(String kinid,String empName,String mail) throws ClassNotFoundException, SQLException {
	
		
		 Class.forName(driver); 
		 Connection dbConnection;
		 dbConnection=(Connection)DriverManager.getConnection(url);
		 String query = "delete from Empployee where kinid=? or empname=?  or mail=?";
		 java.sql.PreparedStatement ps = dbConnection.prepareStatement(query);
		
		ps.setString(1,kinid);
		ps.setString(2,empName);
		ps.setString(3,mail);
		
		 ps.execute();
		  
		return false;
	}



	
	public void searchEmployee(String empName, String mail, String kinid)
			throws ClassNotFoundException, SQLException {
		

		 Class.forName(driver);
		 Connection dbConnection=null;
		 dbConnection=(Connection)DriverManager.getConnection(url);
System.out.println("dtfhsyjkyy");
/*PreparedStatement statement = dbConnection.prepareStatement("select * from Empployee inner join Department on Empployee.departmentid=Department.departmentid inner join Role on Employee.roleid=Role.roleid inner join Project on Employee.projectid=Project.projectid where kinid=? or name=? or email=?");
statement.setString(2,name);

statement.setString(1,Kinid);
statement.setString(3,email);
ResultSet rs = statement.executeQuery();*/
		 String query="select * from Empployee inner join Department on Empployee.deptId=Department.deptId inner join Role on Empployee.roleId=Role.roleId inner join Project on Empployee.projId=Project.projId where kinid=? or empname=? or mail=?";
		java.sql.PreparedStatement ps = dbConnection.prepareStatement(query);
			   ps.setString(1, kinid);
			   ps.setString(2,empName);
			   ps.setString(3, mail);
			System.out.println("abcdef");
			java.sql.ResultSet r = ps.executeQuery();
				 while (r.next()) {
					 
					 System.out.println("kiran");
					 x = r.getString("empid"); 
			    	 y = r.getString("empname"); 
			    	 z = r.getString("kinid"); 
			    	 m = r.getString("mail"); 
			    	 n = r.getString("phno"); 
			    	 u = r.getString("dob"); 
			    	 v = r.getString("doj"); 
			    	 l = r.getString("address"); 
			    	 a = r.getInt("deptId");
			    	 b = r.getString("deptName");
			    	 c = r.getInt("projId");
			    	 d = r.getString("projName");
			    	 e = r.getInt("roleId");
			    	 f = r.getString("roleName");
			         System.out.println("empid:"+x+"\tempname:"+y+"\tkinid:"+z+"\tmail:"+m+"\tphno:"+n+"\tdob:"+u+"\tdoj:"+v+"\taddress:"+l+"\tdeptId"+a+"\tdeptName"+b+"\tprojId"+c+"\tprojName"+d+"\troleId"+e+"\troleName"+f);
			    	
				 }
				
			 
		 
		
		
	}	
		
	
	}







	

/*	@Override
	public boolean RemoveEmployee(String name1, Employee e) throws ClassNotFoundException, SQLException {
		
		 Class.forName(driver); Connection dbConnection;
		 dbConnection=(Connection)DriverManager.getConnection(url);
		 String query = "delete from Employee where name=?";
		PreparedStatement ps = dbConnection.prepareStatement(query);
		ps.setString(2,e.setEmpname(name1));
		//ps.setString(1, e.setEmpname(name1);
		ps.execute();
		 
		 
		 

		return false;
	}*/

	
	
/*
	public EmployeeDaoImplForDb() {
		this.e=e;
		this.names=Name;
		// TODO Auto-generated constructor stub
	}*/
/*
	@Override
	public Employee searchEmployee(String empName, String mail, String kinid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName(driver);
		Connection dbConnection;
		dbConnection = (Connection) DriverManager.getConnection(url);
		String query = "select * from Employee where kinid=?";
		Statement stmt = dbConnection.createStatement();
	    ResultSet rs = stmt.executeQuery("");
		
		
		
		return null;
	}
*/
	/*@Override
	public Employee ModifyEmployee(Map<String, Object> modify, String name, String emailid, String kinid, int ch) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Employee e=SearchEmployee(name,emailid,kinid);
		e.setName((String) modify.get("Name"));
		RemoveEmployee(name,e);
		Class.forName(driver);
		Connection dbConnection;
		dbConnection = (Connection) DriverManager.getConnection(url);
		String query = "update Employee set where name=?";
		PreparedStatement preparedStmt = dbConnection.prepareStatement(query);
		preparedStmt.setString(1, e.setName(name));
		preparedStmt.execute();
		
		return null;
	}*/


	




	/*@Override
	public boolean RemoveEmployee(String name, Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee ModifyEmployee(Map<String, Object> modify, String name, String emailid, String kinid, int ch)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean RemoveEmployee(String name) {
		// TODO Auto-generated method stub
		return false;
	}*/

/*	@Override
	public boolean RemoveEmployee(String name) {
		// TODO Auto-generated method stub
		return false;
	}*/


