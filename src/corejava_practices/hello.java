package corejava_practices;
import javax.swing.JOptionPane;
//      package       method  
// access modifier
//public : access everywhere
//protected: class same package and child class in diff package
//default: same package and class
//access in class only
public class hello {
	//identifier
	public static void main(String[] args) {
		System.out.println("Hello World!");
		JOptionPane.showMessageDialog(null,"Welcome to JAVA");
		JOptionPane.showMessageDialog(null,"Welcome to Python");
	}
}
//class khojna package vitra janu parcha
//{} scope of class class ko body
//static-- change, call with out obj, efficient memory management, belong to class, class variable or class method
// out is static
//String... Vary argument
//final vanya constant
// no need import for java.lang

