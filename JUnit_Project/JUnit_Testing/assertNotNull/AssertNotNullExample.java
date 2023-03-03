package assertNotNull;


import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

import model.Book;
import service.BookServce;

public class AssertNotNullExample {


	@Test
	void AssertNotNull() {
		
		BookServce bs = new BookServce();
		bs.addBook(new Book(11, "Java", "Kelvin", (short) 2020));
		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
		
		
		Book b = bs.getBook(18); 
		assertNotNull(b,"Book not found");
	}
	
//	@Test
//	void searchBookName() {
//		BookServce bs = new BookServce(); 
//		bs.addBook(new Book(11,"Java","Kelvin",(short)2020));
//		bs.addBook(new Book(12,"Php","Kelvin",(short)2020));
//		bs.addBook(new Book(13,"Python","Kelvin",(short)2020));
//		
//		Book b = bs.getBookName("python"); 
//		
//		assertNotNull(b);  
//		
//	}
	
}
