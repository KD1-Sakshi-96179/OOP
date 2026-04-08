package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint2D {
	
	public static Point2D acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate : ");
		double x = sc.nextDouble();
		System.out.println("Enter y co-ordinate : ");
		double y = sc.nextDouble();
		Point2D obj = new Point2D(x, y);
		return obj;
	}
	
	public static void main(String[] args) {
		System.out.println("Point 1 :");
		Point2D obj1 = TestPoint2D.acceptRecord();
		
		System.out.println("Point 2 :");
		Point2D obj2 = TestPoint2D.acceptRecord();
		
		System.out.println(obj1.getDetails());
		System.out.println(obj2.getDetails());
		
		if(obj1.isEqual(obj2)) {
			System.out.println("Given Points are same");
		}
		else {
			System.out.println("Given Points are different");
			double dist = obj1.calDistance(obj2);
			System.out.println("Distance between 2 points : " + dist);
		}
	}

}