package objectwitharray;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	CreateStudents();
}
// create array of 5 students
 static void CreateStudents() {
	Student students[] = new Student[5];
	Scanner sc = new Scanner(System.in);
	//=================for euta object=========================
//	Student s = new Student();
//	s.setId(994);
//	s.setFname("Sam");
//	s.setLname("Tam");           =============YO HARULAI LOOP MA HALNE TALA
//	s.setCollege("HIMALAYA");
//	s.setAge(24);
//	s.setCity("US");
//	
//	students[0]= s;

//====================for loop tara euta object=================
//	for(int i = 0; i<students.length; i++) {
//	Student s = new Student();
//	s.setId(994);
//	s.setFname("Sam");
//	s.setLname("Tam");         
//	s.setCollege("HIMALAYA");
//	s.setAge(24);
//	s.setCity("US");
//	
//	students[i]= s;
//	}
	
	//====================for loop tara dynamic object=================
		for(int i = 0; i<students.length; i++) {
		System.out.println("Enter the name of "+ i + "students");
		Student s = new Student();
		System.out.println("Enter the ID");
		s.setId(sc.nextInt());
		System.out.println("Enter the first name");
		s.setFname(sc.next());
		System.out.println("Enter the last name");
		s.setLname(sc.next()); 
		System.out.println("Enter the college name");
		s.setCollege(sc.next());
		System.out.println("Enter the age");
		s.setAge(sc.nextInt());
		System.out.println("Enter the City");
		s.setCity(sc.next());
		
		students[i]= s;
		}

	
// print student Array
	for (Student std : students) {
		System.out.println(std);
	}
}
}
