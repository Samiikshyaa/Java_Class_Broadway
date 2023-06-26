package Assignment;

public class Triangle {
	int length, breadth, height;
	
	Triangle(){
		this.length=3;
		this.breadth=4;
		this.height=5;		
	}
	
	void area() {
		int b,h;
		b= this.breadth;
		h= this.height;
		double a = 0.5 * b * h;
		System.out.println("The area is: "+ a);
	}
	
	void perimeter() {
		int l,b,h;
		l= this.length;
		b= this.breadth;
		h= this.height;
		int p = l+b+h;
		System.out.println("perimeter:" + p);
		
	}
public static void main(String[] args) {
	Triangle t= new Triangle();
	t.area();
	t.perimeter();
}
	
}
