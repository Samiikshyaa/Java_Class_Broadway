package Array;

public class Calculation {
public static void main(String[] args) {
	int mat1[][]= {{40,60},{90,88}};//2by2
	int mat2[][]= {{1,2},{5,6}};//2by 2
	int mat3[][]= new int[2][2];
	for (int i=0; i<2; i++) { 
		for(int j=0; j<2; j++) {
			mat3[i][j]= mat1[i][j]+mat2[i][j];
			System.out.print(mat3[i][j]+ " ");
			}
		System.out.println();
	}
}
}
