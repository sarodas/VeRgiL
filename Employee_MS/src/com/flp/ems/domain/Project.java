package com.flp.ems.domain;
import java.util.Scanner;


public class Project {
    String project;
    Scanner sc= new Scanner(System.in);
    
public String getproject()
{   String coP;
    System.out.println("choice of project ");
    System.out.println("1.Morgan Stanley");
    System.out.println("2.Barclays");
    System.out.println("3.HSBC");
			coP=sc.next(); 
			
			switch(coP)
			{
			
			case"1":
			System.out.println("project is Morgan Stanley");
			project="morganStanley";
			//sc.close();
			return project;
                            
			case"2":
			System.out.println("project is Barclays");
			project="barclays";
			//sc.close();
			return project;
			
			case"3":
			System.out.println("project is HSBC");
			project="HSBC";
			//sc.close();
			return project;
                            

			default:
			System.out.println("wrong choice");
			break;
			}
sc.close();						
return project;	
}



public String toString() {
	return "Project [project=" + project + "]";
}

    public String setproject(String string) {
        return project;
    }

}