package MyMovie;

import java.util.Comparator;

public class SortByName implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getMovie_name().compareTo(o2.getMovie_name()); 
	}

}
