import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class Ex45AlbumTest {
    @Test
    public void albumTest() {
        Ex45Album album = new Ex45Album();

        Ex45Album.Album myAlbum = album.new Album("My Album", "My Artist");

        myAlbum.addSong("Song 1", 3.5);
        myAlbum.addSong("Song 2", 4.2);
        myAlbum.addSong("Song 3", 2.8);

        Assert.assertEquals("Song 1", myAlbum.findSong("Song 1").getTitle());
        Assert.assertNull(myAlbum.findSong("Nonexistent Song"));

        LinkedList<Ex45Album.Song> playlist = new LinkedList<>();
        myAlbum.addToPlayList(2, playlist);
        myAlbum.addToPlayList(1, playlist);
        myAlbum.addToPlayList(5, playlist);

        Assert.assertEquals(2, playlist.size());
        Assert.assertEquals("Song 2", playlist.get(0).getTitle());
        Assert.assertEquals("Song 1", playlist.get(1).getTitle());
    }
    @Test
    public void songTest() {
        Ex45Album.Song song = new Ex45Album.Song("Song 1", 3.5);

        Assert.assertEquals("Song 1", song.getTitle());
        Assert.assertEquals("Song 1: 3.5", song.toString());
    }
}
