
public class Book {
	double isbnNumber;
	String bookName;
	String author;
	int numofPages;
	int edition;
	float price;
	public Book(double isbnNumber, String bookName, String author, int numofPages, int edition, float price) {
		super();
		this.isbnNumber = isbnNumber;
		this.bookName = bookName;
		this.author = author;
		this.numofPages = numofPages;
		this.edition = edition;
		this.price = price;
	}
	public double getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(double isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumofPages() {
		return numofPages;
	}
	public void setNumofPages(int numofPages) {
		this.numofPages = numofPages;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbnNumber=" + isbnNumber + ", bookName=" + bookName + ", author=" + author + ", numofPages="
				+ numofPages + ", edition=" + edition + ", price=" + price + "]";
	}
	
}
