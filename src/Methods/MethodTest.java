package Methods;

public class MethodTest {
public static void main(String[] args) {
	add();
	area();
	printTable(9);
	int a=getSumOf1to100();
	System.out.println("Sum of 1 to 100:  "+a);
	System.out.println(findSmallestvalue(20, 30));
}
//1. no return type with no arguments
static void add() {
	int a=434;
	int b=4566;
	int c=a+b;
	System.out.println("Total= "+c);
}
static void area() {
	int a=3;
	int b=4;
	int area=a*b;
	System.out.printf("AREA = %d\n",area);
}
//2. no return type(void) with arguments
static void printTable(int n) {
	System.out.println("MULTIPLICATION TABLE");
	for(int i=1; i<=10; i++) {
		System.out.println(n+" * "+ i +" = "+ (n*i));
	}
}

//3.return type(return result with no arguments
static int getSumOf1to100() {
	int s=0;
	for(int i=1; i<=100; i++) {
		s=s+i;
	}
	return s;
}
//3.return type(return result with arguments
static int findSmallestvalue(int x, int y) {
	if(x<y)
		return x;
	else 
		return y;
}

}

