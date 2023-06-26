package inheritance;

public class Test {
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.name = "Bishnu";
		p.company="Google";
		p.salary=50000;
		p.bonus= 68000;
		p.proglang = "Java";
		p.project = "GCloud";
		
		p.print();
	}

}
