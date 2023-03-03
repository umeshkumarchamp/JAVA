package assertFalse;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookServce;

public class AssertFalseExample {

	@Test
	void AssertNotEquals() {
		
		BookServce bs = new BookServce();
		bs.addBook(new Book(11, "Java", "Kelvin", (short) 2020));
		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
		
		assertFalse(bs.getAllBooks().isEmpty()); 
		
	}
}
