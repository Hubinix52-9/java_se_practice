import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayingCatTest {
    @Test
    public void isCatPlayingTest() {
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, 10));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, 36));
        Assertions.assertTrue(PlayingCat.isCatPlaying(false, 35));
    }
}
