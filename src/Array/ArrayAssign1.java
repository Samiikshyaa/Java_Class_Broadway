package Array;

import java.util.Scanner;

public class ArrayAssign1 {
public static void main(String[] args) {
	int[] values= new int[10];
	System.out.println("Enter the price of book: ");
	Scanner sc=new Scanner(System.in);
	for (int i=0; i<values.length; i++) {
		values[i]=sc.nextInt();
	}
	add(values);
}
static void add(int[] arr) {
	int s=0;
	for (int x : arr) {
		s= s+ x;
	}
	System.out.printf("The sum is %d \n", s);
	System.out.println("The average is: "+ (s/arr.length));
}
}
