package controlst.selection;
import java.util.Scanner;

public class SwitchAssign1 {
	public static void main(String args[]) {
		int salary;
		double bonus, total=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Post: ");
		String post = sc.next();
		
		switch(post) {
		case "MD":
			salary=359000;
			bonus=20.67/100;
			total= salary+(salary*bonus);
			break;
		case "CEO":
			salary=234000;
			bonus=18/100;
			total= salary+(salary*bonus);
			break;
		case "MANAGER":
			salary=187000;
			bonus=17.88/100;
			total= salary+(salary*bonus);
			break;
		case "HELPER":
			salary=127809;
			bonus=11/100;
			total= salary+(salary*bonus);
			break;
		default:
			System.out.println("Invalid post");	
			break;
		}
		
		System.out.println("Total Salary of "+ post+ " is "+ total);
	}

}
