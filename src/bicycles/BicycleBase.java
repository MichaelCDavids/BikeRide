package bicycles;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;

public abstract class BicycleBase implements Bicycle {

    protected  int speed = 0;
    protected BicycleType bicycleType;

    protected void changeSpeed(int change){
        this.speed += change;
        if (this.speed < 0) {
            this.speed = 0;
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
