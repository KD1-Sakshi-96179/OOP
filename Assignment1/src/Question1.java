import java.util.Scanner;
public class question1{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer number:");
		int num = sc.nextInt();
		
		String binary = Integer.toBinaryString(num);
	    System.out.println("binary : "+binary);
	  
		
	    String octal = Integer.toOctalString(num);
	    System.out.println("octal :"+octal);
	    
	    String hexadecimal = Integer.toHexString(num);
	    System.out.println("hexadecimal:"+hexadecimal);
	    
	   
	  
	
	
	
	}

}
