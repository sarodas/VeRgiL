package com.flp.ems.domain;

public class Employee {
    private String Employeeid,Phoneno;
	private String Name,Emailid,Dateofbirth,DateofJoining,Address;
	public Department department;
	public Project project;


   
	public void SetName(String Name)
	{
		this.Name=Name;
	}
	
	public String getName() {
		return Name;
	}
	
	
	public void SetEmployeeid(String Employeeid)
	{
		this.Employeeid=Employeeid;
	}
	
	public  String getEmployeeid() {
		return Employeeid;
	}
	

	
	public void SetEmailid(String Emailid)
	{
		this.Emailid=Emailid;
	}
	
	public String getEmailid() {
		return Emailid;
	}
	

	public void SetDateofbirth(String Dateofbirth)
	{
		this.Dateofbirth=Dateofbirth;
		
	}
	public String getDateofbirth() {
		return Dateofbirth;
	}
	
	public void SetAddress(String Address)
	{
		this.Address=Address;
	}
	
	public String getAdress() {
		return Address;
	}
	

	public void SetPhoneno(String Phoneno)
	{
		this.Phoneno=Phoneno;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void SetDateofJoining(String DateofJoining) {
		this.DateofJoining=DateofJoining;
		
		
	}
	public String getDateofJoining() {
		
		return Name;
	}
	public void setDepartment(Department department) {
		this.department=department;
		
	}
	
	
	public Department getDepartment()
	{
		return department;
		
	}
	
	
	
	public void setProject(Project project) {
	
		this.project=project;
		
	}
	
	public Project getProject()
	{
		return project;
	}

	@Override
	public String toString() {
		return (  "Employee [Employeeid=" + Employeeid + ", Phoneno=" + Phoneno + ", Name=" + Name + ", Emailid=" + Emailid
				+ ", Dateofbirth=" + Dateofbirth + ", DateofJoining=" + DateofJoining + ", Address=" + Address
				+ ", department=" + department + ", project=" + project + "]");
	}
    
}