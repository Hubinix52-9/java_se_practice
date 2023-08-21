import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class Ex49PlaylistInnerClassTest {

    private Ex49PlaylistInnerClass playlist;

    @Before
    public void setUp() {
        playlist = new Ex49PlaylistInnerClass();
    }

    @Test
    public void addAlbumTest() {
        boolean added = playlist.addAlbum("My Album", "My Artist");
        Assert.assertTrue(added);

        Ex49PlaylistInnerClass.Album album = playlist.findAlbum("My Album");
        Assert.assertNotNull(album);
        Assert.assertEquals("My Album", album.getTitle());
    }

    @Test
    public void addSongAndFindSongTest() {
        playlist.addAlbum("My Album", "My Artist");
        Ex49PlaylistInnerClass.Album album = playlist.findAlbum("My Album");
        Assert.assertNotNull(album);

        boolean added = album.addSong("Song 1", 3.5);
        Assert.assertTrue(added);

        Ex49PlaylistInnerClass.Song song = album.findSong("Song 1");
        Assert.assertNotNull(song);
        Assert.assertEquals("Song 1", song.getTitle());
    }

    @Test
    public void addToPlaylistTest() {
        playlist.addAlbum("My Album", "My Artist");
        Ex49PlaylistInnerClass.Album album = playlist.findAlbum("My Album");
        Assert.assertNotNull(album);

        album.addSong("Song 1", 3.5);
        album.addSong("Song 2", 4.2);

        LinkedList<Ex49PlaylistInnerClass.Song> playlistSongs = new LinkedList<>();
        boolean addedToPlaylist = album.addToPlaylist(2, playlistSongs);
        Assert.assertTrue(addedToPlaylist);

        Assert.assertEquals(1, playlistSongs.size());
        Assert.assertEquals("Song 2", playlistSongs.get(0).getTitle());
    }
}
