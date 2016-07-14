package com.flp.ems.service;

import java.util.List;
import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public  class EmployeeServiceImpl implements IEmployeeService {
	
	IemployeeDao empDao;
	Employee employee=new Employee();
	Department department=new Department();
	Project project=new Project();
	Role role=new Role();
	
	public EmployeeServiceImpl(){
		empDao=new EmployeeDaoImplForList();
				
	}
	
	public void addEmployee(Map empDetails){

		

		employee.setEmpid((Integer) empDetails.get("empId"));
		employee.setEmpname((String) empDetails.get("empName"));
		employee.setMail((String) empDetails.get("mail"));
		employee.setPhno((Integer)empDetails.get("phno"));
		employee.setAddress((String)empDetails.get("address"));
		employee.setDob((String)empDetails.get("dob"));
		employee.setDoj((String)empDetails.get("doj"));

		department.setDeptid((Integer) empDetails.get("deptId"));
		department.setDeptName((String) empDetails.get("deptName"));

		employee.setDepartment(department);

		project.setProjId((Integer) empDetails.get("projId"));
		project.setProjName((String) empDetails.get("projName"));
		project.setDepartment(department);

		employee.setProject(project);

		role.setRoleId((Integer) empDetails.get("roleId"));
		role.setRoleName((String) empDetails.get("roleName"));

		employee.setRole(role);

		empDao.addEmployee(employee);
		
	}

	public void searchEmployee(int a){
		
	 empDao.searchEmployee(a);
	
	
	
	}
	
	public void removeEmployee(int y){
		empDao.removeEmployee(y,employee);
	}
	
	public void getAllEmp(Map empDetails){
		empDao.getAllEmp(employee);
		
	}

}
