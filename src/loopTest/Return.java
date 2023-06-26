package loopTest;

public class Return {
	public static void main(String[] args) {
		//return method sanga related(exit from method)
		for(int i=1; i<=10; i++) {	
			if(i==5 || i==8) {
			//if(i==5 && i==8){
			//if (i==5) {
				return;
			}
		System.out.println(i);		
		}
		System.out.println("End Loop");
	}
}
