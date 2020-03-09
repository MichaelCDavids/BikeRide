package bicycles;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;

public abstract class BicycleBase implements Bicycle {

    protected  int speed = 0;
    protected BicycleType bicycleType;

    protected void changeSpeed(int change){

        if (this.speed - change <= 0) {
            this.speed = 0;
        } else {
            this.speed += change;
        }
    }

    public int currentSpeed(){
        return this.speed;
    }

    public void stop(){
        this.speed = 0;
    }

    public BicycleType getBicycleType(){
        return this.bicycleType;
    }
}
