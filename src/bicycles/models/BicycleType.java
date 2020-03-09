package bicycles.models;

public enum BicycleType {
    MountainBike(7, -3),
    RoadBike(10, -4),
    Tandem(12, -6);

    private final int accelerationSpeed;
    private final int brakeSpeed;

     BicycleType(int accelerationSpeed, int brakeSpeed){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }
}
