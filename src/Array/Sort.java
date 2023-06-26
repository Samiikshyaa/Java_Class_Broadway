package Array;

import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
	int[] values= {3,42,55,3455,46,46,456};
	Arrays.sort(values);
	System.out.print(Arrays.toString(values));
	
	System.out.println("REVERSE ORDER");
	for(int i=values.length -1; i>=0; i--) {
		System.out.print(values[i]+" ");
	}
	
	Arrays.fill(values, 500);
	System.out.println(Arrays.toString(values));
	
	Arrays.fill(values, 4, 10, 44);
	System.out.println(Arrays.toString(values));
	
	System.out.println(Arrays.toString(Arrays.copyOfRange(values, 2, 8)));
	System.out.println(Arrays.toString(Arrays.copyOf(values, 10)));
	
	
}
}
