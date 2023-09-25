package pl.globallogic.streamsRestaurant.Films;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilmWatchList {
    public static List<Film> createWatchlist() {
        List<Film> watchlist = new ArrayList<>();

        watchlist.add(new Film("Your Name", 96, 8.4, "Drama", Arrays.asList("animation", "fantasy", "romance"), "2016-07-06"));
        watchlist.add(new Film("Spider-Man: Into the Spider-Verse", 117, 8.4, "Action", Arrays.asList("animation", "adventure"), "2018-12-12"));
        watchlist.add(new Film("Spider-Man: Across the Spider-Verse", 140, 8.7, "Action", Arrays.asList("animation", "adventure"), "2023-05-31"));
        watchlist.add(new Film("Interstellar", 169, 8.7, "Sci-Fi", Arrays.asList("drama", "adventure"), "2014-10-26"));
        watchlist.add(new Film("Joker", 122, 8.4, "Thriller", Arrays.asList("crime", "drama"), "2019-08-31"));
        watchlist.add(new Film("The Nun II", 110, 6.0, "Horror", Arrays.asList("mystery", "thriller"), "2023-09-06"));
        watchlist.add(new Film("Sound of Freedom", 131, 7.9, "Action", Arrays.asList("biography", "crime"), "2023-04-07"));
        watchlist.add(new Film("Oppenheimer", 180, 8.6, "Biography", Arrays.asList("drama", "history"), "2023-07-17"));
        watchlist.add(new Film("Culpa mía", 117, 6.2, "Drama", Arrays.asList("romance", "teen"), "2023-05-08"));
        watchlist.add(new Film("The Little Things", 128, 6.3, "Drama", Arrays.asList("crime", "mystery"), "2021-01-28"));
        watchlist.add(new Film("Top Gun: Maverick", 130, 8.3, "Action", Arrays.asList("drama", "military"), "2022-05-27"));
        watchlist.add(new Film("Maestro", 129, 6.7, "Biography", Arrays.asList("drama", "music"), "2023-10-02"));
        watchlist.add(new Film("Tenet", 150, 7.3, "Sci-Fi", Arrays.asList("action", "thriller"), "2020-08-26"));
        watchlist.add(new Film("Evil Dead Rise", 96, 6.6, "Horror", Arrays.asList("mystery", "thriller"), "2023-03-15"));
        watchlist.add(new Film("The Wolf of Wall Street", 180, 8.2, "Biography", Arrays.asList("comedy", "crime"), "2013-10-17"));

        return watchlist;
    }
}

