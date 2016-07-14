package com.flp.ems.dao;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

    public void addEmployee(Employee employee);
    public void searchEmployee(int a);
    public void removeEmployee(int y,Employee emp);
    public void getAllEmp(Employee employee);
        
}

