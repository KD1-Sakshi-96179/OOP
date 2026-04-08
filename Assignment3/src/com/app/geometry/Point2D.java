package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		return "Point2D [x = " + x + ", y = " + y + "]";
	}
	
	public boolean isEqual(Point2D other) {
		if(this.x == other.x && this.y == other.y) 
			return true;
		else return false;
	}
	
	public double calDistance(Point2D other) {
		double hd = Math.pow((other.x - this.x), 2);
		double vd = Math.pow((other.y - this.y), 2);
		double ans = Math.sqrt((hd + vd));
		return ans;
	}

	public static void main(String[] args) {
		
	}
}