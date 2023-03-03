package assertArrayEquals;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookServce;

public class AssertArrayEqualsExample {

	@Test
	void AssertEquals() {
		
		BookServce bs = new BookServce();
		bs.addBook(new Book(11, "Java", "Kelvin", (short) 2020));
		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
		
		Integer[] b = bs.getBookByYearOfPublication((short)2020); 
		
		Integer[] ex = {11,12,13}; 
		
		assertArrayEquals(ex, b);
		
		
	}
	
}
