import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GamesTest {
    @Test

    public void GameTest() {
        Game Game = new Game(true);

        boolean expected = false;
        boolean actual = Game.isFailed(5);

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void GameTest0() {
        SpeedyGame SpeedyGame = new SpeedyGame(true, 3);

        boolean expected = false;
        boolean actual = SpeedyGame.isFailed(5);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void GameManagerTest() {

        GameManager gameManager = new GameManager(new Game(false));
        gameManager.setSpeeds(new int[] {5,0,2,5,3});

        int expected = 0;
        int actual = gameManager.attempts(gameManager.getSpeeds());

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void GameManagerSpeedyTest() {
        GameManager gameManager = new GameManager (new SpeedyGame(false, 2));
        gameManager.setSpeeds(new int[] {1,2,3,4,5});

        int expected = 2;
        int actual = gameManager.attempts(gameManager.getSpeeds());

        Assertions.assertEquals(expected, actual);

    }


}
