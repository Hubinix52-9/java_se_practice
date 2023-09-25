package pl.globallogic.streamsRestaurant.Films;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilmProcessing {
    public static void main(String[] args) {
        List<Film> watchlist = FilmWatchList.createWatchlist();

        // a. Filter films with a duration greater than the specified value
        List<Film> longFilms = watchlist.stream()
                .filter(film -> film.getDuration() > 140)
                .collect(Collectors.toList());

        // b. Return list of film titles in UPPER CASE
        List<String> titlesInUpperCase = watchlist.stream()
                .map(Film::getTitle)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // c. Filter all films of a particular genre and with IMDb rate lower than the specified value
        String selectedGenre = "Action";
        double maxImdbRate = 7.0;
        List<Film> filteredFilms = watchlist.stream()
                .filter(film -> film.getGenre().equals(selectedGenre) && film.getImdbRate() < maxImdbRate)
                .collect(Collectors.toList());

        // d. Find the first film of a particular genre
        Optional<Film> firstActionFilm = watchlist.stream()
                .filter(film -> film.getGenre().equals(selectedGenre))
                .findFirst();

        // e. Return a list of IMDb rates sorted in descending order
        List<Double> sortedImdbRates = watchlist.stream()
                .map(Film::getImdbRate)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // f. Return top-3 films sorted by IMDb rate
        List<Film> top3FilmsByImdbRate = watchlist.stream()
                .sorted(Comparator.comparing(Film::getImdbRate).reversed())
                .limit(3)
                .collect(Collectors.toList());

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
        String keywordToSearch = "animation";
        List<Film> filmsWithKeyword = watchlist.stream()
                .filter(film -> film.getSearchKeywords().contains(keywordToSearch))
                .collect(Collectors.toList());

        // additional queries
        String word = "Name";
        List<Film> filmsWithWord = watchlist.stream()
                .filter(film -> film.getTitle().contains(word))
                .collect(Collectors.toList());

        String genre = "Thriller";
        Optional<Film> filmWithGenre = watchlist.stream()
                .filter(film -> film.getGenre().equals(genre))
                .findAny();

        List<String> sortByTitle = watchlist.stream()
                .map(Film::getTitle)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        //k. Custom queries for your custom film field from 2.f

        List<String> sortByDate = watchlist.stream()
                .map(Film::getReleaseDate)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<Film> filmsReleasedAt = watchlist.stream()
                .filter(film -> film.getReleaseDate().matches("2014-10-26"))
                .collect(Collectors.toList());

        String release = "2013-10-17";
        Optional<Film> filmReleaseDate = watchlist.stream()
                .filter(film -> film.getReleaseDate().equals(release))
                .findAny();

        System.out.println("Long films: " + longFilms);
        System.out.println("Titles in upper case: " + titlesInUpperCase);
        System.out.println("Filtered films: " + filteredFilms);
        System.out.println("First action film: " + firstActionFilm.orElse(null));
        System.out.println("Sorted IMDb rates: " + sortedImdbRates);
        System.out.println("Top 3 films by IMDb rate: " + top3FilmsByImdbRate);
        System.out.println("Total duration: " + totalDuration);
        System.out.println("Longest film: " + longestFilm.orElse(null));
        System.out.println("Has horror film: " + hasHorrorFilm);
        System.out.println("Films with keyword '" + keywordToSearch + "': " + filmsWithKeyword);
        System.out.println("Films with word '" + word + "' in title: " + filmsWithWord);
        System.out.println("Film with genre '" + genre + "': " + filmWithGenre.orElse(null));
        System.out.println("Films sorted by title: " + sortByTitle);
        System.out.println("Films sorted by title: " + sortByDate);
        System.out.println("Films released at certain date: '" + filmsReleasedAt);
        System.out.println("Film with release date '" + release + "': " + filmReleaseDate.orElse(null));
    }
}

