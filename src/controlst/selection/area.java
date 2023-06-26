package controlst.selection;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		int l,b,h, area = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l= sc.nextInt();
		System.out.println("Enter the breadth: ");
		b= sc.nextInt();
		System.out.println("Enter the height: ");
		h= sc.nextInt();
		
		if (l!=0 && b!=0 && h!=0) {
		area = l*b*h;}
		else {System.out.println("Please Enter some value");}
		
		System.out.println("Total Area: "+ area);
	}
}
