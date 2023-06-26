package Assignment;

public class AStudent {
	String name;
	int roll_no;
	long phone_no;
	String address;
	
	void Showdetails() {
		System.out.println("Roll no." + roll_no);
		System.out.println("Phone no. "+ phone_no);
		System.out.println("Address "+ address);
		System.out.println();
	}
	
	public static void main(String[] args) {
		AStudent s1 = new AStudent();
		s1.name = "John";
		s1.roll_no = 2;
		s1.phone_no = 9849898410L;
		s1.address = "Nepal";
		s1.Showdetails();
		
		AStudent s2  = new AStudent();
		s2.name = "Sam";
		s2.roll_no = 3;
		s2.phone_no = 9848989011L;
		s2.address = "Japan";
		s2.Showdetails();
		
		
	}
}
