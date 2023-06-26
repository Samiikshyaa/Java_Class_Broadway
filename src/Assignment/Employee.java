package Assignment;

public class Employee {
	int year_of_join;
	String name, address;
	
	void showinfo(String n, int y, String a) {
		name = n;
		year_of_join = y;
		address = a;
		System.out.println(n+"            "+y+"                  "+a);
	}
	public static void main(String[] args) {
		Employee r = new Employee();
		Employee s = new Employee();
		Employee j = new Employee();
		
		System.out.println("Name"+"          " + "Year of Joining"+"               "+"Address");
		r.showinfo("Robert", 1994,"64C- WallsStreat");
		s.showinfo("Sam", 2000,"68D- WallsStreat");
		j.showinfo("John", 1999,"26B- WallsStreat");
	}
}
