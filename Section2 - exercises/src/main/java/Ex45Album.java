import java.util.ArrayList;
import java.util.LinkedList;

public class Ex45Album {
    class Album{
        private String name, artist;
        private ArrayList<Ex45Album.Song> songs;
        public Album(String name, String artist){
            this.name = name;
            this.artist = artist;
            this.songs = new ArrayList<Ex45Album.Song>();
        }
        public boolean addSong(String title, double duration){
            return songs.add(new Song(title, duration));
        }
        public Song findSong(String title){
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
        public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                Song song = songs.get(trackNumber - 1);
                playlist.add(song);
                return true;
            }
            return false;
        }
    }
    static class Song{
        private String title;
        private double duration;
        public Song(String title, double duration){
            this.duration = duration;
            this.title = title;
        }
        public String getTitle(){
            return title;
        }
        @Override
        public String toString(){
            return title +": "+duration;
        }
    }



}
