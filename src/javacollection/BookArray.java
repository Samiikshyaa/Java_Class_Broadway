package javacollection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Book> bk = new LinkedList<>();
	//for (int i=0;i<2;i++){
		Book b = new Book();
			b.setAuthor("Ram");
			b.setTitle("Hello Hello");
			b.setPrice(12);
		bk.add(b);
		Book bo = new Book();
			bo.setAuthor("Ramu");
			bo.setTitle("Hello World");
			bo.setPrice(21);
		bk.add(bo);
	//}
	for(Book i: bk) {
		System.out.println(i);
	}
}
}
