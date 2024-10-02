//Balam Ruchith Balaji
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class MovieCollection implements Iterable<Movie> {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}

public class IteratorExample {
    public static void main(String[] args) {
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(new Movie("Inception"));
        movieCollection.addMovie(new Movie("Interstellar"));
        movieCollection.addMovie(new Movie("The Dark Knight"));

        for (Movie movie : movieCollection) {
            System.out.println("Movie: " + movie.getName());
        }
    }
}
