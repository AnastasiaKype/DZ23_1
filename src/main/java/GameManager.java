public class GameManager {
    protected int[] speeds;

    public int[] getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int[] speeds) {
        this.speeds = speeds;
    }

    public GameManager(Game game) {
        this.game = game;
    }

    Game game = new Game(true);


    public int attempts(int[] speeds) {

        int sum = 0;

        for (int round : speeds) {
            if (!game.isFailed(round)) {
                sum++;

            } else {
                continue;
            }
        }
        return sum;
    }

    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int i = 0;
        int x = 0;
        while (i != rounds) {
            if (game.isFailed(p1.getSpeed())) {
                if (game.isFailed(p2.getSpeed())) {
                    x = 0;
                } else {
                    x = -1;
                }
                break;
            } else {
                if (!game.isFailed(p2.getSpeed())) {
                    x = 1;
                }
            }
            i++;
        }
        return x;
    }
}
