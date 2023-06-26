package Assignment;

import java.util.Scanner;

public class Average {
	int x,y,z;
	
	void average() {
		float a;
		a = (x+y+z)/3;
		System.out.println("Average: "+ a);
	}
	 
	public static void main(String[] args) {
		Average avg = new Average();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		avg.x= sc.nextInt();
		avg.y= sc.nextInt();
		avg.z= sc.nextInt();
		avg.average();
		
	}
	
}
