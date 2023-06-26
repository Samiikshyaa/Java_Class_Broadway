package Assignment;

import java.util.Scanner;

public class Area2 {
	double length, breadth;
	Area2(double l, double b){
		this.length = l;
		this.breadth = b;
	}
	double returnArea() {
		double a = this.length * this.breadth;
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double l = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		double b = sc.nextDouble();
		Area2 a = new Area2(l,b);
		System.out.println("Area = "+ a.returnArea());
		
	}
}
