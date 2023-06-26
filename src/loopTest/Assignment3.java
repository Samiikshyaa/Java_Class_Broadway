package loopTest;
import java.util.Scanner;

//to count prime numbers between given range
public class Assignment3 {
		public static void main(String[] args) {
			int n,m,i,j,c=0, factor;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Range ");
			System.out.print("from: ");
			n = sc.nextInt();
			System.out.print("to: ");
			m = sc.nextInt();
			System.out.println("\nPrime Numbers are: ");
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
					
				
				if(factor==0) {c=c+1; System.out.println(i);}
			}
			System.out.printf("\nTotal number of prime numbers between range: %d to %d: %d",n,m,c);
		}
	}

