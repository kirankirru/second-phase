package com.flp.ems.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
	public void addEmployee(Map empDetails);
    public void searchEmployee(int a);
    public void removeEmployee(int y);
    public void getAllEmp(Map empDetails);
    
}
