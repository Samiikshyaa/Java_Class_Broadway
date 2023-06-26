package Assignment;

public class Rectangle {
	int length, breadth;
	
	Rectangle(int l, int b){
		this.length=l;
		this.breadth=b;
	}
	 int Area() {
		 int a = this.length*this.breadth;
		 return a;
	 }
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,4);
		Rectangle r2 = new Rectangle(8,5);
		System.out.println("The Areas are: ");
		System.out.println(r1.Area()+" and "+r2.Area());
	}
}
