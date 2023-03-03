package model;

public class Book {

	private int book_id; 
	private String book_name; 
	private String author_name; 
	private short year_of_pub;
	public Book(int book_id, String book_name, String author_name, short year_of_pub) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.year_of_pub = year_of_pub;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public short getYear_of_pub() {
		return year_of_pub;
	}
	public void setYear_of_pub(short year_of_pub) {
		this.year_of_pub = year_of_pub;
	} 
	
	
	
}
