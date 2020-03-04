package bicycles.models;
import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {


    @Override
    public void accelerate() {
        speed += 11;
    }

    @Override
    public void brake() {
        speed -= 4;
    }
}
