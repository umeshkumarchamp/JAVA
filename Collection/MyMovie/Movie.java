package MyMovie;

public class Movie {
	private String movie_name; 
	private float movie_rating; 
	private int year_of_release;
	private String movie_type;
	public Movie(String movie_name, float movie_rating, int year_of_release, String movie_type) {
		super();
		this.movie_name = movie_name;
		this.movie_rating = movie_rating;
		this.year_of_release = year_of_release;
		this.movie_type = movie_type;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public float getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(float movie_rating) {
		this.movie_rating = movie_rating;
	}
	public int getYear_of_release() {
		return year_of_release;
	}
	public void setYear_of_release(int year_of_release) {
		this.year_of_release = year_of_release;
	}
	public String getMovie_type() {
		return movie_type;
	}
	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}
	@Override
	public String toString() {
		return "Movie Name = " + movie_name + "\t Rating = " + movie_rating + "\t Year Of Release = "
				+ year_of_release + "\t Movie Type = " + movie_type;
	} 
	
	
	
	

}
