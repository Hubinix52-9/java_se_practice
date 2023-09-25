import java.util.ArrayList;
import java.util.LinkedList;

public class Ex49PlaylistInnerClass {

    private ArrayList<Album> albums;

    public Ex49PlaylistInnerClass() {
        albums = new ArrayList<>();
    }

    public boolean addAlbum(String albumTitle, String artist) {
        if (findAlbum(albumTitle) == null) {
            albums.add(new Album(albumTitle, artist));
            return true;
        }
        return false;
    }

    public Album findAlbum(String albumTitle) {
        for (Album album : albums) {
            if (album.getTitle().equals(albumTitle)) {
                return album;
            }
        }
        return null;
    }

    public class Album {

        private String title;
        private String artist;
        private SongList songs;

        public Album(String title, String artist) {
            this.title = title;
            this.artist = artist;
            this.songs = new SongList();
        }

        public String getTitle() {
            return title;
        }

        public boolean addSong(String title, double duration) {
            return songs.add(new Song(title, duration));
        }

        public Song findSong(String title) {
            return songs.findSong(title);
        }

        public Song findSong(int trackNumber) {
            return songs.findSong(trackNumber);
        }

        public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
            Song song = findSong(trackNumber);
            if (song != null) {
                playlist.add(song);
                return true;
            }
            return false;
        }
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (!songs.contains(song)) {
                songs.add(song);
                return true;
            }
            return false;
        }

        public Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }

    public static class Song {

        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title + ": " + duration;
        }
    }
}