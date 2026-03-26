package com.sunbeam;
import java.util.Scanner;

class Employee
{
	private String fname;
	private String Lname;
	private double Monthlysalary;
	
	Employee(){
		
	}
	Employee(String fname,String Lname,double salary)
	{
		this.fname=fname;
		this.Lname=Lname;
		this.Monthlysalary=salary;
	}
	String getFirstName()
	{
		return this.fname;
		
	}
	void setFirstName(String fname)
	{
		this.fname=fname;
	}
	String getLastName()
	{
		return this.Lname;
	}
	void setLastName(String Lname)
	{
		this.Lname=Lname;
	}
	double getMonthlySalary()
	{
		return this.Monthlysalary;
	}
	void setMonthlySalary(double salary)
	{
		if(salary>0)
		this.Monthlysalary=salary;
		else
			this.Monthlysalary=0;
	}
	double getYearlySalary()
	{
		return Monthlysalary*12;
	}
	double getRaiseSalary()
	{
		return this.Monthlysalary*1.10;
	}
	
}
class EmployeeTest
{
	Employee emp = new Employee();
	public void acceptRecord() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter first name:");
	String fname=sc.nextLine();
	emp.setFirstName(fname);
	
	System.out.print("Enter last name:");
	String Lname=sc.nextLine();
	emp.setLastName(Lname);
	

	System.out.print("Enter monthly salary:");
	double salary=sc.nextDouble();
	emp.setMonthlySalary(salary);
	}
	
	public void printRecord() {
		System.out.println("first name :"+emp.getFirstName());
		System.out.println("last name:"+emp.getLastName());
		System.out.println("Monthlysalary: "+emp.getMonthlySalary());
		System.out.println("yearlySalary:"+emp.getYearlySalary());
		System.out.println("Salary after 10% rise:"+emp.getRaiseSalary());
		
	}
	
}




public class Question2 {
	public static void main(String[]args) {
	EmployeeTest Et = new EmployeeTest();
	Et.acceptRecord();
	Et.printRecord();
	EmployeeTest Et1 = new EmployeeTest();
	Et1.acceptRecord();
	Et1.printRecord();
	
	}	

}
