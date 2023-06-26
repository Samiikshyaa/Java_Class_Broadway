package loopTest;

public class Break {
	public static void main(String[] args) {
		//break(exit from loop)
		for(int i=1; i<=10; i++) {	
			//if(i==5 || i==8) {
			//if(i==5 && i==8){
			if (i==5) {
				break;
			}
		System.out.println(i);		
		}
		System.out.println("End Loop");
	}
}
