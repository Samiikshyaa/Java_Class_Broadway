package loopTest;

public class Continue {
	public static void main(String[] args) {
		//continue(skips value) for loop
		for(int i=1; i<=10; i++) {	
			//if(i==5 || i==8) {
			//if(i==5 && i==8){
			if (i==5) {
				continue;
			}
		System.out.println(i);		
		}
		System.out.println("End Loop");
	}
}
