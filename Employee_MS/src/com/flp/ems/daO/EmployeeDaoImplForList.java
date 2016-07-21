package com.flp.ems.daO;

import com.flp.ems.domain.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.flp.ems.view.BootClass;

public class EmployeeDaoImplForList implements IEmployeeDao {
    String eid;
    ArrayList<Employee> ee1 = new ArrayList<>();
    Iterator<Employee> itr;
    Scanner sc = new Scanner(System.in);
   // private Object string;
    @Override
    public void addEmployee(Employee ee){
        ee1.add(ee);
	System.out.println("Employee added succefully");
        
    }

    @Override
    public void searchEmployeeK(String EmployeeID){
        for(Employee ee:ee1) 	{
			
			if(ee.getEmployeeid().equals(EmployeeID))
			{System.out.println("Employee found ");
			System.out.println(ee);
			}
                        else{
                            System.out.println("Employee Does not Exist");
                            BootClass.menuSelection();
                        }
        
    }

    }
    @Override
    public void searchEmployeeN(String name){
        for(Employee ee:ee1) 	{
			
			if(ee.getName().equals(name))
			{System.out.println("Employee found ");
			System.out.println(ee);
			}
                        else{
                            System.out.println("Employee Does not Exist");
                            BootClass.menuSelection();
                        }
        
    }

    }
    @Override
    public void searchEmployeeE(String email){
        for(Employee ee:ee1) 	{
			
			if(ee.getEmailid().equals(email))
			{System.out.println("Employee found ");
			System.out.println(ee);
			}
                        else{
                            System.out.println("Employee Does not Exist");
                            BootClass.menuSelection();
                        }
        
    }

    }
    
    @Override
     public void removeEmployee(){
     boolean flag;
     flag=Search();
     if(flag==true){
        itr = ee1.iterator();
        while(itr.hasNext())
	{
            Employee ee2=(Employee) itr.next();
	    if(ee2.getEmployeeid().equals(eid)){
		itr.remove();
                System.out.println("Employee removed succesfully");
            }
	    else {
                System.out.println("Employee Not found to remove");
            }
		}
     }
     else
        BootClass.menuSelection();
         
    }
     
public boolean Search(){
    int ch;
    System.out.println("1.Search by Kin ID");
    System.out.println("2.Search by Name");
    System.out.println("3.Search by Email");
    System.out.println("4.Exiting..");
    
    ch=sc.nextInt();
    switch(ch){
        case 1:
            for(Employee ee:ee1) 	{
			System.out.println("Enter the Kin id");
                        String EmployeeID =sc.nextLine();
			if(ee.getEmployeeid().equals(EmployeeID))
			{System.out.println("Employee found ");
			return true;
			}
                        else{
                            System.out.println("Employee Does not Exist");
                            return false;
                        }
            }
        case 2:                
        for(Employee ee:ee1) 	{
			System.out.println("Enter the Name");
                        String name =sc.nextLine();
			if(ee.getName().equals(name))
			{System.out.println("Employee found ");
			return true;
			}
                        else{
                        System.out.println("Employee Does not Exist");
                        return false;
                        }
            }
        case 3:                
        for(Employee ee:ee1) 	{
			System.out.println("Enter the Email");
                        String email =sc.nextLine();
			if(ee.getEmailid().equals(email))
			{System.out.println("Employee found ");
			return true;
			}
                        else{
                        System.out.println("Employee Does not Exist");
                        return false;
                        }
    }

    
}
        return false;
}

    
    @Override
    public void modifyEmployee() {
        boolean flag;
        flag=Search();
        if(flag==true)
        {
            int ch;
            System.out.println("Enter the field you want change");
            System.out.println("1.Phone number");
            System.out.println("2.Address");
            System.out.println("3.Exit..");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the phone Number");
                    String pn=sc.nextLine();
                    ee1.get(1).SetPhoneno(pn);
                case 2:
                    System.out.println("Enter the Address");
                    String add=sc.nextLine();
                    ee1.get(1).SetPhoneno(add);
                case 3:
                    BootClass.menuSelection();
                
            }
        }
        
       
    }
        
    

    @Override
    public void getAllEmployee()
{
     
     itr =ee1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
}






}