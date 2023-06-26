package loopTest;

public class DoWhileTest {
	//do while
		// do{ //st }while(cond);
	public static void main(String[] args) {
		int n=9;
		int i=1;
		int mul=0;
		do {
			mul = n * i;			
			System.out.println(n+" * "+ i +" = "+ mul );
			i = i+1;
		}while(i<=10);
			
	}
}
