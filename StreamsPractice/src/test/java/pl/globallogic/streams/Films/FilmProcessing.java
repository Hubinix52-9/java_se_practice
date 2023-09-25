package pl.globallogic.streams.Films;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FilmProcessing {
    public static void main(String[] args) {
        List<Film> watchlist = FilmWatchList.createWatchlist();

        // a. Filter films with a duration greater than the specified value
        List<pl.globallogic.streams.Films.Film> longFilms = watchlist.stream()
                .filter(film -> film.getDuration() > 120)
                .toList();

        // b. Return list of film titles in UPPER CASE
        List<String> titlesInUpperCase = watchlist.stream()
                .map(Film::getTitle)
                .map(String::toUpperCase)
                .toList();

        // c. Filter all films of a particular genre and with IMDb rate lower than the specified value
        String selectedGenre = "Drama";
        double maxImdbRate = 9.0;
        List<Film> filteredFilms = watchlist.stream()
                .filter(film -> film.getGenre().equals(selectedGenre) && film.getImdbRate() < maxImdbRate)
                .toList();

        // d. Find the first film of a particular genre
        Optional<Film> firstActionFilm = watchlist.stream()
                .filter(film -> film.getGenre().equals(selectedGenre))
                .findFirst();

        // e. Return a list of IMDb rates sorted in descending order
        List<Double> sortedImdbRates = watchlist.stream()
                .map(Film::getImdbRate)
                .sorted(Comparator.reverseOrder())
                .toList();

        // f. Return top-3 films sorted by IMDb rate
        List<Film> top3FilmsByImdbRate = watchlist.stream()
                .sorted(Comparator.comparing(Film::getImdbRate).reversed())
                .limit(3)
                .toList();

        // g. Return a total watch list duration
        int totalDuration = watchlist.stream()
                .mapToInt(Film::getDuration)
                .sum();

        // h. Return the longest film in a list
        Optional<Film> longestFilm = watchlist.stream()
                .max(Comparator.comparingInt(Film::getDuration));

        // i. Return true if any of the films in a watch list satisfies the criteria
        boolean hasHorrorFilm = watchlist.stream()
                .anyMatch(film -> film.getSearchKeywords().contains("Horror"));

        // j. Return a list of films with a common search keyword
        String keywordToSearch = "swords";
        List<Film> filmsWithKeyword = watchlist.stream()
                .filter(film -> film.getSearchKeywords().contains(keywordToSearch))
                .toList();


        System.out.println("2h hours films: " + longFilms);
        System.out.println("Upper case titles: " + titlesInUpperCase);
        System.out.println("Filtered films: " + filteredFilms);
        System.out.println("First action film: " + firstActionFilm.orElse(null));
        System.out.println("Sorted IMDb rates: " + sortedImdbRates);
        System.out.println("Top 3 films by IMDb rate: " + top3FilmsByImdbRate);
        System.out.println("Total duration: " + totalDuration);
        System.out.println("Longest film: " + longestFilm.orElse(null));
        System.out.println("Has horror film: " + hasHorrorFilm);
        System.out.println("Films with keyword '" + keywordToSearch + "': " + filmsWithKeyword);
    }
}

