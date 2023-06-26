package corejava_practices;

import java.util.Scanner;

public class practice_circle_area {
	public static void main(String... args) {
		double a;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the radius");
		a= sc.nextDouble();
		double r= Math.PI*Math.pow(a,2);
		
		System.out.println("The area is: "+ r+" m^2");
		
		
	}
}
