package bicycles.specifications;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public BicycleSpecification( BicycleType bicycle){
        this.accelerationSpeed = bicycle.getAccelerationSpeed();
        this.brakeSpeed = bicycle.getBrakeSpeed();
        this.bicycleType = bicycle;
    }


    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public BicycleType getBicycleType() {
        return bicycleType;
    }
}
