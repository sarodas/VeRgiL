package com.flp.ems.daO;

import com.flp.ems.domain.Employee;

public interface IEmployeeDao {

    public void addEmployee(Employee ee);

    public void searchEmployeeK(String EmployeeID);
    
    public void searchEmployeeE(String EmployeeID);
    
    public void searchEmployeeN(String EmployeeID);

    public void removeEmployee();

    public void modifyEmployee();

    public void getAllEmployee();
    
}