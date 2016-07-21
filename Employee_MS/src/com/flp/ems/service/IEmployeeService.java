package com.flp.ems.service;

import java.util.HashMap;

public interface IEmployeeService {

    public void modifyEmployee();
    
    public void getAllEmployee();

    public void addEmployee(HashMap<String,String> hm);

    public void searchEmployeeE(String email);
    
    public void searchEmployeeK(String eID);
    
    public void searchEmployeeN(String name);

    public void removeEmployee();
    
}