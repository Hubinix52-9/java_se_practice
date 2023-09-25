package pl.globallogic.streams.Films;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilmWatchList {
    public static List<Film> createWatchlist() {
        List<Film> watchlist = new ArrayList<>();

        watchlist.add(new Film("The Shawshank Redemption", 144, 9.3, "Drama", Arrays.asList("Stephen King", "thriller", "best film")));
        watchlist.add(new Film("The Godfather", 175, 9.2, "Drama", Arrays.asList("crime", "blood")));
        watchlist.add(new Film("The Lord of the rings: The Return of the King", 201, 9.0, "Action", Arrays.asList("tolkien", "swords", "best film")));
        watchlist.add(new Film("The Lord of the rings: The Two Towers", 179, 8.8, "Action", Arrays.asList("tolkien", "two towers", "aragorn")));
        watchlist.add(new Film("The Matrix", 196, 8.7, "Sci-fi", Arrays.asList("action", "future", "AI")));
        watchlist.add(new Film("The Nun II", 110, 6.0, "Horror", Arrays.asList("mystery", "thriller")));
        watchlist.add(new Film("Seven Samurai", 207, 8.6, "Drama", Arrays.asList("Japan", "past")));
        watchlist.add(new Film("The Green Mile", 189, 8.6, "Drama", Arrays.asList("crime", "super powers", "injustice")));
        watchlist.add(new Film("Star Wars: Episode IV - A New Hope", 121, 8.6, "Sci-fi", Arrays.asList("action", "lightsabers")));
        watchlist.add(new Film("Spirited Away", 125, 8.6, "Anime", Arrays.asList("ghost", "mystery", "drama")));
        watchlist.add(new Film("Gladiator", 215, 8.5, "Action", Arrays.asList("rome", "ancient times", "swords")));
        watchlist.add(new Film("The Lion King", 88, 8.5, "Animation", Arrays.asList("love", "musical", "animals")));
        watchlist.add(new Film("Alien", 117, 8.5, "Horror", Arrays.asList("monster", "thriller")));
        watchlist.add(new Film("Django Unchained", 165, 8.5, "Thriller", Arrays.asList("injustice", "action", "bounty hunters")));
        watchlist.add(new Film("WALL-E", 98, 8.4, "Animation", Arrays.asList("comedy", "sci-fi")));

        return watchlist;
    }
}

