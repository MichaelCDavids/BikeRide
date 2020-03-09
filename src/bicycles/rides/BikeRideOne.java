package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.interfaces.BikeRide;

public class BikeRideOne implements BikeRide {

    Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }

}
