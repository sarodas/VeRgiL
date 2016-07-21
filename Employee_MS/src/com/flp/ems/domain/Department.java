package com.flp.ems.domain;

import java.util.Scanner;
public class Department {
    int dID;
    private String nDEPT;
    Scanner sc = new Scanner(System.in);
    public String getdepartment(){
        String coD;
           
       // System.out.println("Choice of differnt department");
        System.out.println("a. ADM");
        System.out.println("b. Cards");
        System.out.println("c. Testing");
        coD=sc.nextLine();
			
	switch (coD) {
	case "a": 
            System.out.println("Department is ADM");
	        nDEPT="ADM";
            return nDEPT;
        case "b":
            System.out.println("Department is Cards");
	    nDEPT="Cards";
            return nDEPT;
        case "c":
            System.out.println("Department is testing");
	    nDEPT="testing";    
            return nDEPT;
        
    }
	sc.close();
 return null;  
}

    public String setdepartment(String string) {    
    	return nDEPT;
    }
}