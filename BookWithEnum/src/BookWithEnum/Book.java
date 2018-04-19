package BookWithEnum;

public class Book {

	private String title;
	private String author;
	private int releaseDate;
	private double price;
	
	
	java.util.Date today= new java.util.Date();
	static java.time.LocalDate currentDate=java.time.LocalDate.now();
	static int year=currentDate.getYear();
	
	
	public Book(String title, String author, int releaseDate, double price) {
		this.title=title;
		this.author=author;
		this.releaseDate=releaseDate;
		this.price=price;
	}
	
	public Book(String title, String author) {
		this(title,author,year,2500);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void priceIncrase(double percent) {
		this.price*=1+(percent/100);
	}
	
	public String toString() {
		return "Cím: "+this.title+" Szerző: "+this.author+ " Kiadás éve: "+this.releaseDate+" Ár: "+this.price;
	}
	
	public boolean isTitleMatch(Book otherBook) {
		return this.title.equals(otherBook.title);
	}
}
