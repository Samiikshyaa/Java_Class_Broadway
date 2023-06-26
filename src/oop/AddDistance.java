package oop;

public class AddDistance {
	float inch, foot;
	float setInch(float i) {inch = i; return inch;}
	float setFoot(float f) {inch = f; return foot; }
	
	static  float add(float i, float f) {
		return(i+f);
	}
	public static void main(String[] args) {
	AddDistance d1 = new AddDistance();
	AddDistance d2 = new AddDistance();
	System.out.println(add(d1.setInch(4), d1.setFoot(8)));
	}
	
}
