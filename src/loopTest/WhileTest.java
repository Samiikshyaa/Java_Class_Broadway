package loopTest;

public class WhileTest {
	//preiteration=for while
	//postiteration=do while
	
	public static void main(String[] args) {
		int n=5, fact=1;
		while(n!=0)
		{
			fact= fact * n;
			n = n-1;
			
		}
		System.out.println("factorial "+fact);
	}
}

