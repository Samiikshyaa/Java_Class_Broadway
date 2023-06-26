package loopTest;

//to print prime numbers between given range
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		int n,m,i,j, factor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range ");
		System.out.print("from: ");
		n = sc.nextInt();
		System.out.print("to: ");
		m = sc.nextInt();
		
		for(i=n; i<=m; i++)
		{
			if(i==0 || i==1) continue;
			factor = 0;
			
			for(j=2; j<=i-1; j++) 
			{
				if(i%j==0) {
					factor=1;
					break;}
			}
				
			
			if(factor==0)System.out.println(i);
		}
	}
}
