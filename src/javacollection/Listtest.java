package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listtest {
 public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	//List<String> list = new LinkedList<>();
	 
	 
	 
	 list.add("nepal");
	 list.add("india");
	 list.add("Usa");
	 System.out.println( list.size());
	for (String s: list) {
		System.out.println(s);
	}
}
}
