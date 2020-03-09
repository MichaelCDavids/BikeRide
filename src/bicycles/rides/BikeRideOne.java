package bicycles.rides;


import bicycles.interfaces.Bicycle;
import bicycles.interfaces.BikeRide;
import bicycles.models.BicycleType;


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

    public void stop(){
        this.bicycle.stop();
    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }

    public BicycleType getBicycleType(){
        return this.bicycle.getBicycleType();
    }
}
