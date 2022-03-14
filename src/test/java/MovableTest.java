import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MovableTest {
    @Test
    public void FastPlayerTest() {

        Movable player = new FastPlayer(10, 15);

        int speed1 = player.getSpeed(); // speed1 = 25
        int speed2 = player.getSpeed(); //  speed2 = 40


    }

    @Test
    public void greenLightTest() {
        GameManager gameManager = new GameManager(new Game(true));
        int expected = 0;
        int actual = gameManager.loser(new FastPlayer(0,1), new FastPlayer(0, 1), new Game(true), 5);
        Assertions.assertEquals(expected, actual);


    }
}