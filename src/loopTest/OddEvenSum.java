package loopTest;

public class OddEvenSum {
	public static void main(String args[]) {
		int s=0, o=0;
	for(int i=1; i<=100; i++) 
	{
		if(i%2==0)
			s=s+i;
		else
			o=o+i;
	}
		System.out.println("Odd sum "+o);
		System.out.println("Even sum "+s);
		System.out.println("Total sum  "+ (s+o));
	}
}