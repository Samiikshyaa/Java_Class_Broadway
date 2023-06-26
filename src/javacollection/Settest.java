package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Settest {
public static void main(String[] args) {
	//Set<String> set = new HashSet<>();
	//Set<String> set = new TreeSet<>();
	Set<String> set = new LinkedHashSet<>();
	
	set.add("Java");
	set.add("SQL");
	set.add("Java");
	set.add("HTML");
	set.add("CSS");
	
	for(String s : set) {
		System.out.println(s);
	}
}
}
