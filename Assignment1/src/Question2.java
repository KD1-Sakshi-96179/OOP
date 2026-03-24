import java.util.Scanner;
public class Question2 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		double num1=0;
		double num2 = 0;
		System.out.print("enter number num1 :");
	    if(!sc.hasNextInt())
	    {
	    	if(sc.hasNextDouble())
	    	{
	    		num1=sc.nextDouble();
	    	}
	    	else
	    	{
	    		System.out.println("You have not entered double value");
	    	}
	    }
	    else {
	    	System.out.println("you have entered integer value");
	    }
	    
	    System.out.print("enter number num2 :");	
	    if(!sc.hasNextInt()) {
	    	if(sc.hasNextDouble())
	    	{
	    		num2=sc.nextDouble();
	    		double avg = num1+num2/2;
	    		System.out.println("avg :"+avg);
	    		
	    	}
	    	else
	    	{
	    		System.out.println("you have not entered double value");
	    	}
	    }
	    else
	    {
	    	System.out.println("you have entered integer value");
	    }
	    }
	    
	  
	    	
	    
	    
	    
	}


