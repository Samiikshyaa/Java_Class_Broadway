package Array;

import java.util.Arrays;

public class Arraywithmethod {
//	***array with method 
// array as argument
	// void sum(int a[]) {}
	//int[] x={21,47,24,26,4,37};
	//sum(x);
	
	
	
// array as return type
	//int[] get10IntValues(){
	//array=3,89,2,83,1,28,4;
	//return array;
	
public static void main(String[] args) {
	//int values[]= {2,53,5,4,64,57,7};
	int values[]=getoddnofrom1to100();
	System.out.println(Arrays.toString(values));
	add(values);
}
// array as arguments
static void add(int array[]) {
	int s=0;
	for (int x: array) {
		s=s+x;
	}
	System.out.println("Total= "+s);
}

static int[] getoddnofrom1to100() 
{
	int j=0;
	int[] oddnums= new int[50];
	for(int i=1; i<=100; i++) {
		if(i%2!=0) {
			oddnums[j]=i;
			j++;
	}
	}
	return oddnums;
	
}

}
//20 int array, 5 le divide hune matra nikalne
