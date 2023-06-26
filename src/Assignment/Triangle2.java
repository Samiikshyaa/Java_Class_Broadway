package Assignment;

public class Triangle2 {
	int length, breadth, height;
	Triangle2(int l, int b, int h){
		this.length= l;
		this.breadth= b;
		this.height= h;
	}
	//Triangle2(){}
	void area() {
		double a = 0.5 *this.breadth*this.height;
		System.out.println("The area is "+ a);
	}
	
	void perimeter() {
		int p = this.length+this.breadth+this.height;
		System.out.println("The perimeter is "+p);
	}
	
	public static void main(String[] args) {
		Triangle2 t = new Triangle2(3,4,5);
		t.area();
		t.perimeter();
	}
}
