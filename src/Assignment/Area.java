package Assignment;

public class Area {
	int l;
	int b;
	
	void setDim(int ln, int br) {
		l = ln;
		b = br;
	}
	
	int getArea() {
		return (l*b) ;
	}
	
	public static void main(String[] args) {
		Area a = new Area();
		a.setDim(7,8);
		System.out.println("Area: "+ a.getArea());
	}
}
