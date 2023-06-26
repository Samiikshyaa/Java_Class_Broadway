package Assignment;

import java.util.Scanner;

public class Complex {
	int i, r;
	
	 int getRealNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real number: ");
		int real = sc.nextInt();
		return real;		
	}
	 int getImagNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the imaginary number: ");
		int imag = sc.nextInt();
		return imag;
	}

	static int sum(int a, int b) {
		return(a+b);
	}
	static int difference(int a, int b) {
		return(a-b);
	}
	static int product(int a, int b) {
		return(a*b);
	}
	public static void main(String[] args) {
		Complex c1 = new Complex();
		System.out.println("Enter the first complex number");
		int p = c1.getRealNumbers();
		int q = c1.getImagNumbers();
		System.out.println("Enter the second complex number");
		Complex c2 = new Complex();
		int r = c2.getRealNumbers();
		int s = c2.getImagNumbers();
		System.out.println("The sum is: " +sum(p,r)+" + "+ sum(q,s)+ "i");
		System.out.println("The difference is: " +difference(p,r)+" + "+ difference(q,s)+ "i");
		System.out.println("The product is: " +product(p,r)+" + "+ product(q,s)+ "i");
		

	}
}
