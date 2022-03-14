public class FastPlayer implements Movable{
    private int startSpeed;
    private int speedStep;

    public int getSpeed(){
        int newSpeed = startSpeed;
        this.startSpeed = startSpeed + speedStep;
        return startSpeed;
    }

    public FastPlayer(int startSpeed, int stepSpeed) {
        this.startSpeed = startSpeed;
        this.speedStep = stepSpeed;
    }
}
