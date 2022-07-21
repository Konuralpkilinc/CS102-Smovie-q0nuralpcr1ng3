import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Movie
 */
public class Movie {

    private String name;
    private String[] genre;
    private ImageIcon poster;
    private String description; 
    
    static ArrayList<Movie> movies = new ArrayList<>();
    
   

    public String[] getGenre(){
        return genre;
    }



    public Movie(String name, String[] genre, ImageIcon poster, String description) {
        this.name = name;
        this.genre = genre;
        this.poster = poster;
        this.description = description;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setGenre(String[] genre) {
        this.genre = genre;
    }



    public ImageIcon getPoster() {
        return poster;
    }



    public void setPoster(ImageIcon poster) {
        this.poster = poster;
    }



    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }


    public static ArrayList<Movie> getMovies() {
        return movies;
    }



    public static void setMovies(ArrayList<Movie> movies) {
        Movie.movies = movies;
    }
    
}