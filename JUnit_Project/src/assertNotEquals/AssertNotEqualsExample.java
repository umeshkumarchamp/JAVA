package assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookServce;

public class AssertNotEqualsExample {

	@Test
	void AssertNotEquals() {
		
		BookServce bs = new BookServce();
		bs.addBook(new Book(11, "Java", "Kelvin", (short) 2020));
		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
		
		Book b = bs.getBook(13); 
		assertNotEquals("Kelvin rana",b.getAuthor_name());
		assertNotEquals(2021, b.getYear_of_pub()); 
		assertNotEquals("php", b.getBook_name());
		assertNotEquals(17,b.getBook_id()); 
		
	}
	
	
}
