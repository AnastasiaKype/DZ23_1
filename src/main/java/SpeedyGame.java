public class SpeedyGame extends Game {
    protected int MaxSpeed;

    public SpeedyGame(boolean isGreenLight, int MaxSpeed) {
        super(isGreenLight);
        this.MaxSpeed = MaxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    @Override
    public boolean isFailed(int speed) {


        if ((getIsGreenLight() == false)&&(speed > MaxSpeed)) {
            return true;
        } else {
            return false;
        }


    }


}