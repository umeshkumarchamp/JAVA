package assertTrue;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookServce;
public class AssertTrueExample {

	@Test
	void searchBookName() {
		BookServce bs = new BookServce(); 
		bs.addBook(new Book(11,"Java","Kelvin",(short)2020));
		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
		
		assertTrue(bs.getAllBooks().isEmpty());
				
	}
	
}
