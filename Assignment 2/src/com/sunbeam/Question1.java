package com.sunbeam;
import java.util.Scanner;
class Invoice{
	private String partNo;
	private String partdes;
	 int qty;
	 double price;
	
	Invoice(){
		
	}
	Invoice(String partNo,String partdes,int qty,double price)
	{
		this.partNo=partNo;
		this.partdes=partdes;
		this.qty=qty;
		this.price=price;
		
		
	}
	String getPartNo()
	{
		return this.partNo;
	}
	void setPartNo(String partNo)
	{
		this.partNo=partNo;
	}
	String getPartdes()
	{
		return this.partdes;
		
	}
	void setPartDes(String partdes)
	{
		this.partdes=partdes;
	}
	int getQuantity()
	{
		return this.qty;
	}
	void setQuantity(int qty)
	
	{
		if(qty>0)
		this .qty=qty;
		else
			this.qty=0;
	}
	double getPrice()
	{
		return this.price;
	}
	void setPrice(int price)
	{
		if(price>0)
			this.price=price;
		else
			this.price=0;
	}
	public double calculateInvoice()
	{
		return qty*price;
	}
	
}
class InvoiceTest{
	Invoice Iv=new Invoice();
	int qty;
	int price;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("part number:");
		String partNo=sc.nextLine();
		Iv.setPartNo(partNo);
		
		System.out.print("part description:");
		String partdes = sc.nextLine();
		Iv.setPartDes(partdes);
		
		System.out.print("Quantity:");
		int qty = sc.nextInt();
		Iv.setQuantity(qty);
		
		System.out.print("price:");
		double price = sc.nextDouble();
		Iv.setPrice(qty);
	}
	public void printRecord()
	{
		System.out.println("part no:"+Iv.getPartNo());
		System.out.println("part description:"+Iv.getPartdes());
		System.out.println("Quantity:"+Iv.getQuantity());
		System.out.println("price:"+Iv.getPrice());
		System.out.println("total invoice calculate"+Iv.calculateInvoice());1
		
	}
	public void calculate()
	{
		System.out.println("total invoice calculate"+Iv.calculateInvoice());
	}
	 
}

public class Question1 {
	public static void main(String[]args) {
		InvoiceTest It = new InvoiceTest();
		It.acceptRecord();
		It.printRecord();
		It.calculate();
		It.printRecord();
		
		
	}

}
