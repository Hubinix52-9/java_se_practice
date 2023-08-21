import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Ex48InterfaceTest {
private Ex48Interface inter;
@Before
public void setUp(){inter = new Ex48Interface();}


        @Test
        public void testPlayer() {
            Ex48Interface.Player player = inter.new Player("Tim", 10, 15);
            String expected = "Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}";
            assertEquals(expected, player.toString());
        }

        @Test
        public void testMonster() {
            Ex48Interface.Monster monster = inter.new Monster("Werewolf", 20, 40);
            String expected = "Monster{name='Werewolf', hitPoints=20, strength=40}";
            assertEquals(expected, monster.toString());
        }
    }
