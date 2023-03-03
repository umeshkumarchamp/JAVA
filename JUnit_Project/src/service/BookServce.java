package service;

import java.util.ArrayList;
import java.util.List;

import model.Book;

public class BookServce {

	List<Book> listOfBooks = new ArrayList<>();
	
	public void addBook(Book book) {
		listOfBooks.add(book); 
	}
	
	public List<Book> getAllBooks(){
		
		return listOfBooks; 
	}
	
	public Book getBook(int bookId) {
		for(Book book:listOfBooks) {
			if(bookId == book.getBook_id()) {
				return book; 
			}
			
		}
		return null; 
	}
	public Book getBookName(String bookName) {
		for(Book book: listOfBooks) {
			if(bookName.equalsIgnoreCase(book.getBook_name())) {
				return book; 
			}
		}
		return null; 
	}
	
	public Integer[] getBookByYearOfPublication(short year) {
		List<Integer> bookIds = new ArrayList<>(); 
		for(Book book : listOfBooks) {
			if(year== book.getYear_of_pub()) {
				bookIds.add(book.getBook_id()); 
			}
		}
		 
		 
		return bookIds.toArray(new Integer[bookIds.size()]); 
	}
	
}
