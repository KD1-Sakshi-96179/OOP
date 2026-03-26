package com.sunbeam;
import java.util.Scanner;

class Date
{
	private int month;
	private int day;
	private int year;
	
	Date()
	{
		
	}
	Date(int month,int day,int year){
		this.month=month;
		this.day=day;
		this.year=year;
		
	}
	int getMonth()
	{
		return this.month;
	}
	void setMonth(int month)
	{
		this.month=month;
	}
	int getDay()

	{
		return this.day;
	}
	void setDay(int day)
	{
		this.day=day;
	}
	int getYear()
	{
		return this.year;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	public void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
		
	}
	
	
}
class DateTest{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);{
		
		System.out.print("Enter month:");
		int m = sc.nextInt();
		
		System.out.print("Enter day:");
		int d = sc.nextInt();
		
		System.out.print("Enter year:");
		int y = sc.nextInt();
		
		Date obj = new Date(m,d,y);
		
		System.out.print("Entered Date:");
		obj.displayDate();
		
		obj.setMonth(06);
		obj.setDay(20);
		obj.setYear(2003);
		
		System.out.print("updated date:");
		obj.displayDate();
	}
}
}
