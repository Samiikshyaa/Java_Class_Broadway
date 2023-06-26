package objectwitharray;

public class Book {
	private int price;
	private String author;
	private String booktitle;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", author=" + author + ", booktitle=" + booktitle + "]";
	}
	
	
}
