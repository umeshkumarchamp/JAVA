package MyMovie;

import java.util.Comparator;

public class SortByYear implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getYear_of_release() > o2.getYear_of_release()) {
			return 1; 
		}
		else if(o1.getYear_of_release() < o2.getYear_of_release()) {
			return -1; 
		}
		return 0;
	}

}
