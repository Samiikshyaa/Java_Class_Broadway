package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
public static void main(String[] args) {
	//subjectname and marks
	
	//Map<String, Integer> map = new HashMap<>();
	Map<String, Integer> map = new TreeMap<>(); 
	//Map<String, Integer> map = new LinkedHashMap<>();
	
	 map.put("Math", 99);
	 map.put("Nepali", 99);
	 map.put("0Math", 98);
	 
	 for(String key : map.keySet()) {
		 System.out.println(key + " = " + map.get(key));
	 }
}
}
