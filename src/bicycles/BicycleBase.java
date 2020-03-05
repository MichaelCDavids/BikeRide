package bicycles;

import bicycles.interfaces.Bicycle;

public abstract class BicycleBase implements Bicycle {

    protected  int speed = 0;

    protected void changeSpeed(int change){
        this.speed += change;
    }

    @Override
    public int currentSpeed(){
        return this.speed;
    }

    @Override
    public void stop(){
        this.speed = 0;
    }
}
