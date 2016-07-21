package com.flp.ems.util;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validate {
	 private static Pattern pattern;
	  private static Matcher matcher;
	  
	  
	  public static void emailValidation(String email)
	  {
	  String patternvalidation="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@”+”[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	  pattern = Pattern.compile(patternvalidation);
	  matcher = pattern.matcher(email);
	  if(matcher.matches())
	  {
	  System.out.println("Valid Email");
	  }
	  else
	  {
	  System.out.println("Invalid Email. Retry");
	  }
	  }
	  
	  public static void nameValidation(String name)
	  {
	  String patternvalidation="[A-Z][a-z]+( [A-Z][a-z]+)";
	  pattern = Pattern.compile(patternvalidation);
	  matcher = pattern.matcher(name);
	  if(matcher.matches())
	  {
	  System.out.println("Valid name");
	  }
	  else
	  {
	  System.out.println("Invalid name");
	  }

}
	  public static void phonenNumberValidation(String phonenumber)
	  {
	  String patternvalidation="\\d{3}-\\d{7}";
	  
	  pattern = Pattern.compile(patternvalidation);

	  matcher = pattern.matcher(phonenumber);
	  if(matcher.matches())
	  {
	  System.out.println("Valid Phone Number");
	  }
	  else
	  {
	  System.out.println("Invalid Phone Number. Retry");
	  }

	  }
	  
	   public boolean validate(String date){
		   final String DATE_PATTERN = 
			          "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
			  
		     matcher = pattern.matcher(date);

		     if(matcher.matches()){
					 
			 matcher.reset();
					  
			 if(matcher.find()){
			
		             String day = matcher.group(1);
			     String month = matcher.group(2);
			     int year = Integer.parseInt(matcher.group(3));
						 
			     if (day.equals("31") && 
				  (month.equals("4") || month .equals("6") || month.equals("9") ||
		                  month.equals("11") || month.equals("04") || month .equals("06") ||
		                  month.equals("09"))) {
					return false; // only 1,3,5,7,8,10,12 has 31 days
			     } else if (month.equals("2") || month.equals("02")) {
		                  //leap year
				  if(year % 4==0){
					  if(day.equals("30") || day.equals("31")){
						  return false;
					  }else{
						  return true;
					  }
				  }else{
				         if(day.equals("29")||day.equals("30")||day.equals("31")){
						  return false;
				         }else{
						  return true;
					  }
				  }
			      }else{				 
				return true;				 
			      }
			   }else{
		    	      return false;
			   }		  
		     }else{
			  return false;
		     }			    
		   }
	  
	 
	 }

