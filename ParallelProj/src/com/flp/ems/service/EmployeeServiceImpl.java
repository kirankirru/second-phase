package com.flp.ems.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForDb;

import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public  class EmployeeServiceImpl implements IEmployeeService {
	
	IemployeeDao empDao;
	
	
	public EmployeeServiceImpl(){
		//empDao=new EmployeeDaoImplForList();
		empDao=new EmployeeDaoImplForDb();
				
	}
	
	public void addEmployee(Map empDetails) throws ClassNotFoundException, SQLException{
       
		List<Employee> employees=new ArrayList<Employee>(); 
		Employee employee=new Employee();
		Department department=new Department();
		Project project=new Project();
		Role role=new Role();
		
		
	//	if(!employees.contains(employee))

		employee.setEmpid((String) empDetails.get("empid"));
		employee.setKinid((String) empDetails.get("Kinid"));
		
		employee.setEmpname((String) empDetails.get("empName"));
		employee.setMail((String) empDetails.get("mail"));
		employee.setPhno((String)empDetails.get("phno"));
		employee.setAddress((String)empDetails.get("address"));
		employee.setDob((String)empDetails.get("dob"));
		employee.setDoj((String)empDetails.get("doj"));

		employee.setDeptId((Integer) empDetails.get("deptId"));
		/*department.setDeptName((String) empDetails.get("deptName"));

		employee.setDepartment(department);
*/
		employee.setProjId((Integer) empDetails.get("projId"));
		/*project.setProjName((String) empDetails.get("projName"));
		project.setDepartment(department);

		employee.setProject(project);
*/
		employee.setRoleId((Integer) empDetails.get("roleId"));
	/*	role.setRoleName((String) empDetails.get("roleName"));

		employee.setRole(role);*/
		
		empDao.addEmployee(employee);
        /*
		List<Employee>employeee=empDao.getAllEmployee();
				if(employeee==null)
				{
		          empDao.addEmployee(employee);
		          }
				else if (!employeee.contains(employee))
			   {
					empDao.addEmployee(employee);
				}*/
	}

	public boolean removeEmployee(String kinid,String empName,String mail) throws ClassNotFoundException, SQLException {
		//Employee e=new Employee();
		
		return empDao.removeEmployee(kinid,empName,mail);
      }

	
	public void searchEmployee(String kinid,String empName,String mail) throws ClassNotFoundException, SQLException{
          System.out.println("fjhtjytu");		
		 empDao.searchEmployee(kinid,empName,mail);
	}

	//public List<Employee> getAllEmployee() {
	//	return empDao.getAllEmployee();
		
	
	
	//}
	
	public void modifyEmployee(Map empModifiedDetails,Employee emp,int ch) {
		//empDao.modifyEmployee(empModifiedDetails,emp,ch);
		
	}

	public void getAllEmployee() throws ClassNotFoundException, SQLException {
	
		empDao.getAllEmployee();
	}

	/*@Override
	public boolean removeEmployee(String kinid, String empName, String mail) {
		// TODO Auto-generated method stub
		return false;
	}*/

}
