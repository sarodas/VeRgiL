package com.flp.ems.service;

import java.util.*;


import com.flp.ems.daO.IEmployeeDao;
import com.flp.ems.daO.EmployeeDaoImplForList;
import com.flp.ems.domain.*;

public class EmployeeServiceImpl implements IEmployeeService{
    
    IEmployeeDao ied = new EmployeeDaoImplForList();
 

    public void addEmployee(HashMap<String,String> hm) {
       Employee ee = new Employee();
       Department depT= new Department();
       Project proJ = new Project();
       
        ee.SetEmployeeid((String) hm.get("EmployeeID"));
        ee.SetAddress((String) hm.get("Address"));
        ee.SetDateofbirth((String)hm.get("Dateofbirth"));
        ee.SetDateofJoining((String) hm.get("DateofJoining"));
	    ee.SetName((String) hm.get("Name"));
	    ee.SetEmailid((String) hm.get("Emailid"));
	    ee.SetPhoneno((String) hm.get("Phoneno"));
        
        proJ.setproject((String)hm.get("project"));
        ee.setProject(proJ);
        
        depT.setdepartment((String)hm.get("Department"));
	    ee.setDepartment(depT);
        
        ied.addEmployee(ee);
    }

    @Override
    public void modifyEmployee() {
     ied.modifyEmployee();   
    }
    
   
     @Override
    public void searchEmployeeK(String kin){
    ied.searchEmployeeK(kin);
    }
    
    public void searchEmployeeN(String name){
    ied.searchEmployeeN(name);
    }
    
     @Override
    public void searchEmployeeE(String email){
    ied.searchEmployeeE(email);
    }
     
     public void getAllEmployee(){
    	 
     }
     
     public void removeEmployee(){
    	 
     }
    
   
}