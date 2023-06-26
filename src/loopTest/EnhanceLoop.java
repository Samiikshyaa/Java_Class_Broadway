package loopTest;

public class EnhanceLoop {
	//enhance for loop/ for each
		//used to read data from collection
		//euta euta nikalne gari
		
		//for(data_type var:collection){ statement}
		
	public static void main(String[] args) {
	int arr[]= {38,25,23,52,39,84,98,69,85,35,93,4}, s=0;
		for(int i: arr) {
			s=s+i;
		}
		System.out.println("Sum " + s);
	}
}
