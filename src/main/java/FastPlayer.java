public class FastPlayer implements Movable{
    private int startSpeed;
    private int stepSpeed;

    @Override
    public int getSpeed(){
        int newSpeed = startSpeed;
        this.startSpeed = startSpeed + stepSpeed;
        return newSpeed;
    }

    public FastPlayer(int startSpeed, int stepSpeed) {
        this.startSpeed = startSpeed;
        this.stepSpeed = stepSpeed;
    }
}
