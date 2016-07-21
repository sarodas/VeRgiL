package com.flp.ems.view;


import java.util.HashMap;
import java.util.Scanner;
import com.flp.ems.domain.*;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction{
    public String eID ,phNO , coProj;
    public String nm ,email,doB,doJ, addR ;
    public String dept,proj;
    boolean checkD;
    
    Employee ee = new Employee();
    
    Department Dept = new Department();
    
    Project pj = new Project();
    
    Scanner sc = new Scanner(System.in);
    
    IEmployeeService ies = new EmployeeServiceImpl();
    
    Validate vd = new Validate();
    
    static UserInteraction ui= new UserInteraction();
    
  
public void addEmployee(){
    HashMap<String, String> hm = new HashMap<>();
    System.out.print("Enter the name of Employee");
    nm=sc.nextLine();
    hm.put("Name",nm);
    
    System.out.println("Enter the EmployeeID");
    eID=sc.nextLine();
    hm.put("EmployeeID",eID);
    
    do{
	System.out.println("Enter the  DateofBirth");
	doB=sc.nextLine();
	checkD=vd.validate(doB);
	if(checkD==true)
	    hm.put("Dateofbirth",doB );
	else 
	    System.out.println("invalid date");
	}while (checkD==false);
    System.out.println("Enter the  Adress");
    addR=sc.nextLine();
    hm.put("Address", addR);
    
    do{
       System.out.println("Enter the of DateofJoining");
       doJ=sc.nextLine();
       checkD=vd.validate(doJ);
       if(checkD==true)
	{	
            hm.put("DateofJoining", doJ);
	        
	}
	else
	    System.out.println("invalid date enter the date again");
	}while(checkD==false);
    
    System.out.println("Enter the phoneno of employee");
    phNO=sc.nextLine();
    hm.put("Phoneno",phNO);
    
    System.out.println("choice of differnt department ");
    dept=Dept.getdepartment();
    System.out.println("choice of differnt Project");
    proj=pj.getproject();
    
			  
hm.put("Department",dept);
hm.put("project", proj);
			
ies.addEmployee(hm);
			
		
}   

public void modifyEmployee() {
     ies.modifyEmployee();
	}

public void searchEmployee() {
		
    while(true){
        System.out.println("1.Search by Email_id:");
	System.out.println("2.Search by Name:");
	System.out.println("3.Search by Kin");
        System.out.println("4.Exit.");
	int i=sc.nextInt();
			
	switch(i){
	        case 1: 
		System.out.println("Enter the Email");
		String emaiL=sc.next();
		ies.searchEmployeeE(emaiL);
	        break;
		case 2:  
		System.out.println("Enter the Name");
		String name=sc.next();
		ies.searchEmployeeN(name);
		break;
		case 3:
		System.out.println("Enter the Kin");
		String kin=sc.next();
		ies.searchEmployeeK(kin);
		break;
		case 4:
                BootClass.menuSelection();   
		}
	}
}

public void removeEmployee() {
           ies.removeEmployee();
	
	}

public void getAllEmployee(){
ies.getAllEmployee();
}

}