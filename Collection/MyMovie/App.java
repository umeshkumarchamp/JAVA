package MyMovie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Movie> listOfMovies = new ArrayList<>(); 
		
		// adding movie objects into the movie list
		listOfMovies.add(new Movie("WAR",4.5f,2021,"Action")); 
		listOfMovies.add(new Movie("Bahubali",7.5f,2019,"Action"));
		listOfMovies.add(new Movie("Hera Pheri",2.5f,2001,"Comedy"));
		listOfMovies.add(new Movie("Border",8.5f,1998,"Action"));
		listOfMovies.add(new Movie("KGF",5.5f,2020,"Action"));
		listOfMovies.add(new Movie("RRR",6.5f,2022,"Action"));
		listOfMovies.add(new Movie("Dilwale",7.5f,2017,"Action")); 
		listOfMovies.add(new Movie("ABCD",8.5f,2014,"Dance"));
		System.out.println("\nMy Original Movie list : \n");
		listOfMovies.forEach(val -> System.out.println(val));
		
		// sorting by name 
		Collections.sort(listOfMovies, new SortByName());
		
		System.out.println("\nSorting by movie name : \n");
		listOfMovies.forEach(val -> System.out.println(val));
		
		Collections.sort(listOfMovies, new SortByYear()); 
		System.out.println("\nSorting by Releasing Year : \n");
		listOfMovies.forEach(val -> System.out.println(val));
		
	}

}
