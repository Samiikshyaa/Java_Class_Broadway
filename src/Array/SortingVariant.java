package Array;

import java.util.Arrays;

public class SortingVariant {
public static void main(String[] args) {
	int[] nums= {2,2,3,43,53,45,46};
	String a = arrange(nums);
	System.out.println(a);
}

static String arrange(int[] num) {	
	Arrays.sort(num);
	System.out.println("The Ascending Value: ");
	return Arrays.toString(num);	
}
}
