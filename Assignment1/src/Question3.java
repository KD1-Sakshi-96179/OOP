import java.util.Scanner;
public class Question3
{
	public static void main(String[] args)
	{
		double dPrice = 40.0, sPrice = 10.0, iPrice = 30.0, total = 0;
		int bill=0;
		int choice=0;
		int Quantity;
		Scanner sc=new Scanner(System.in);
		while(choice!=3) 
		{
			
			System.out.println(" 1.Idli (40)");
			System.out.println(" 2.Samosa(20)");
			System.out.println(" 3.idli(20)");
			
			
			
			System.out.print("Choice: ");
            choice = sc.nextInt();
		switch(choice) 
		{
		
		case 1:
			System.out.println("Quantity: ");
			Quantity=sc.nextInt();
			total +=Quantity*dPrice;
			
		break;
		case 2:
			System.out.println("Quantity: ");
			Quantity=sc.nextInt();
			total +=Quantity*sPrice;
			
			break;
			
		case 3:
			System.out.println("Quantity: ");
			Quantity=sc.nextInt();
			total +=Quantity*iPrice;
			
			break;
			
		default:
			System.out.println("Invalid choice");
			
		   }
		 System.out.println("Total: ₹" + total);
		}
	}

}