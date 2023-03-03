package assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookServce;

public class AssertEqualsExample {

	@Test
	void AssertEquals() {
		
		BookServce bs = new BookServce();
		bs.addBook(new Book(11, "Java", "Kelvin", (short) 2020));
		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
		
		Book b = bs.getBook(13); 
		
		
		assertEquals("Kelvin",b.getAuthor_name(),()->"Invalid author name");
		assertEquals("Python", b.getBook_name());
		assertEquals(2020,b.getYear_of_pub());
		assertEquals(13,b.getBook_id());
	}
	
		
}
