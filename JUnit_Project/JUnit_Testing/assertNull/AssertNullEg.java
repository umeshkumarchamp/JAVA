package assertNull;

import static org.junit.Assert.assertNull;


//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Book;
import  service.BookServce;
class AssertNullEg {

//	@Test
//	void test() {
//		BookServce bs = new BookServce(); 
//		bs.addBook(new Book(11,"Java","Kelvin",(short)2020));
//		bs.addBook(new Book(11,"Php","Kelvin",(short)2020));
//		bs.addBook(new Book(11,"Python","Kelvin",(short)2020));
//		assertTrue(bs.getAllBooks().isEmpty());
//	}
	
	@Test
	void searchBookName() {
		BookServce bs = new BookServce(); 
		bs.addBook(new Book(11,"Java","Kelvin",(short)2020));
		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
		
		//assertTrue(bs.getAllBooks().isEmpty());
		assertNull(bs);
		
	}

}
