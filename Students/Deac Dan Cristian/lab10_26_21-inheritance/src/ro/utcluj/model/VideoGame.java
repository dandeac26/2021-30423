package ro.utcluj.model;

public class VideoGame extends Product{
    private String genre;
    private double rating;

    public VideoGame(){

    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
