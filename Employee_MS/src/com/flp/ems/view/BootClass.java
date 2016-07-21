package com.flp.ems.view;
import com.flp.ems.domain.Employee;

import java.util.*;
import java.util.ArrayList;
public class BootClass {
    private static int i;
    BootClass(int choice)
	{
		BootClass.i=choice;
	}
    public static UserInteraction ui = new UserInteraction();
    Employee ee = new Employee();
   
    public static void menuSelection(){
        boolean flag= true;
        while(flag==true)
        {
        System.out.println("Welcome to Employment Management System");
        System.out.println("Input your choice of Selection from Below");
        System.out.println("1. Add Employee");
        System.out.println("2. Modify Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Search Employee");
        System.out.println("7. Display All Employee");
        System.out.println("8. Exit");
        Scanner sc= new Scanner(System.in);
        BootClass o1;
    	o1 = new BootClass(i);
        i=sc.nextInt();
        ArrayList<Employee> finalist;
        
        switch(i){
            case 1:
                ui.addEmployee();
                System.out.println("anything else ??? enter 1 for yes");
				i= sc.nextInt();
				
				if(i == 1)
					flag=true;
				else 
				{
					System.out.println("THANK YOU");
					flag=false;
				}
                break;
            case 2:
                ui.modifyEmployee();
                break;
            case 3:  
                ui.removeEmployee();
                break;
            case 4:  
                ui.searchEmployee();
                break;
            case 7:  
                ui.getAllEmployee();
                break;
            case 8:  
                System.out.println("Exiting..");
                break;
        }
        sc.close();
        
        }
    }
    public static void main(String[] args) {
        menuSelection();
        
    }

    public BootClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
