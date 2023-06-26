package oop;

public class Student {
	//properties
	int id;
	String fname;
	String lname;
	int age;
	String college;
	//methods
	
	void printStudent() {
		System.out.println("ID "+id);
		System.out.println("First Name: "+fname);
		System.out.println("last Name: "+lname);
		System.out.println("Age: "+age);
		System.out.println("College: "+college);
	}
	public static void main(String[] args) {
		Student st =new Student();
		st.id = 3001;
		st.fname = "Sammy";
		st.lname = "Tammy";
		st.age = 22;
		st.college = "HCOE";
		st.printStudent();
	}
	
	
}
