package objectwitharray;

import java.util.Scanner;

public class BookRun {
public static void main(String[] args) {
	Book books[] = new Book[2];
	Scanner sc = new Scanner(System.in);
	int c[]= new int[2];
	String au[]= new String[2];
	String title[]= new String[2];
	for (int i= 0; i<books.length; i++) {
		Book b = new Book();
		System.out.println("Enter the book title");
		b.setBooktitle(sc.next());
		System.out.println("Enter the book author");
		b.setAuthor(sc.next());
		System.out.println("Enter the book price");
		b.setPrice(sc.nextInt());		
		books[i]= b;
		c[i] = b.getPrice();	
		au[i] = b.getAuthor();
		title[i] = b.getBooktitle();
	}
	
	for (Book a : books) {
		System.out.println(a);
	}
	//sc.close();
	sum(c);
	SearchByAuthor(au,title);
	
}

static void sum(int a[]) {
	int sum = 0;
	for(int x : a) {
		sum = sum + x;
	}
	System.out.println("The sum of price is: "+ sum);
}
static void SearchByAuthor(String a[], String t[]) {
	for(int i= 0; i<a.length; i++) {
		if(a[i] == "Ram" ) {
		 System.out.println(t[i]);
		 //break;
		}
	}
}
}


