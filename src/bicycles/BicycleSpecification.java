package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    private Bicycle bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, Bicycle bicycle){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycle;
    }


    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public Bicycle getBicycleType() {
        return bicycleType;
    }
}
