package Array;

import java.util.Arrays;

public class SortMinMax {
public static void main(String[] args) {
// +++++++++++ TO  DO EVERYTHING IN MAIN ++++++++++++++
	
//	int[] values= {22,32,43,4,45,64,5};
//	Arrays.sort(values);
//	System.out.println(Arrays.toString(values));
//	int min= values[0];
//	System.out.println(min);
//	int max= values[values.length-1];
//	System.out.println(max);

	System.out.println(getMax());

}
static int getMax() {
	int[] values= {12,42,35,43,64,56};
	int max=values[0];
	for(int i= 1; i<values.length; i++) {
		if(values[i]>max)max=values[i];
	}
	return(max);
}
}
