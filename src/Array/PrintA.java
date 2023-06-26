package Array;

public class PrintA {
public static void main(String[] args) {
	String[] values= {"Ram","Shyam","Hari"};
	printarray(values);
}
static void printarray(String array[]) {
	for(String x: array) {
		System.out.println(x);
	}
}

}
