package controlst.selection;
import java.util.Scanner;

public class switchAssign2 {
			public static void main(String args[]) {
			int a,b;
			double sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the a: ");
			a= sc.nextInt();
			System.out.println("Enter the b: ");
			b= sc.nextInt();
			System.out.println("Enter the operator: ");
			String post = sc.next();
			
			switch(post) {
			case "+":
				sum=a+b;
				break;
			case "-":
				sum=a-b;
				break;
			case "*":
				sum=a*b;
				break;
			case "/":
				sum=a/b;
				break;
			default:
				System.out.println("Invalid");	
				break;
			}			
			System.out.println("Total Ans "+ sum);
		}

	}
