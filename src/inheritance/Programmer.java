package inheritance;

public class Programmer extends Employee{
String proglang;
String project;
int bonus;

void print() {
	super.print();
	//print();
	System.out.println(proglang);
	System.out.println(project);
	System.out.println(bonus);
	
}
}
