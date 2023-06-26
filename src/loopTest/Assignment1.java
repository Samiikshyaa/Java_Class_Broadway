package loopTest;

import java.util.Scanner;

//to check given number is prime or not
public class Assignment1 {
	public static void main(String[] args) {
		int n,i, factor=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		n = sc.nextInt();
		if(n==1||n==0) {
			System.out.println("It is neither");
			return;}
		for(i=2; i<=n-1; i++) {
			if(n%i==0) {
				factor=1;
				break;
			}
		}
		if(factor==1)
			System.out.println(n+" is not Prime number");
		else
			System.out.println(n+" is Prime number");
	}
}