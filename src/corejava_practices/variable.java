package corejava_practices;
import java.util.Scanner;
public class variable {
//to store value/data
//data stored for further processing
//collect, store, process, show o/p
/* syntax;
 * data_type Variable_name;
 * */
	
	//dynamic input liney == get from user
	//from console or from ui
	public static void main(String[] args)
	{
		// to print 500 and 700
	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the vallue of a");
	a= sc.nextInt();
	
	System.out.println("Enter the vallue of a");
	b= sc.nextInt();
	
	int s= a+b;
	System.out.println("Total: "+s);
	
	}
}
