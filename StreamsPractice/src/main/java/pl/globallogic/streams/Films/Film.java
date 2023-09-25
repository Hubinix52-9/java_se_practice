package pl.globallogic.streams.Films;

import java.util.Date;
import java.util.List;

public class Film {
    private String title;
    private int duration;
    private Double imdbRate;
    private String genre;
    private List<String> searchKeywords;

    private String filmType;

    public Film(String title, int duration, Double imdbRate, String genre, List<String> searchKeywords) {
        this.title = title;
        this.duration = duration;
        this.imdbRate = imdbRate;
        this.genre = genre;
        this.searchKeywords = searchKeywords;
    }

    // Getters and setters for the fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Double getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(Double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(List<String> searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", imdbRate=" + imdbRate +
                ", genre='" + genre + '\'' +
                ", searchKeywords=" + searchKeywords +
                '}';
    }
}
