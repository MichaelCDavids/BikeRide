package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

    @Test
    void checkCurrentSpeedMethod(){
        BicycleSpecification bike = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle rideBike = new BicycleFromSpec(bike);

        BikeRideTwo testRun = new BikeRideTwo(rideBike);


        assertEquals(0,testRun.currentSpeed());
    }
    @Test
    void checkCurrentSpeedAfterRideMethod(){
        BicycleSpecification bike = new BicycleSpecification(BicycleType.Tandem);
        Bicycle rideBike = new BicycleFromSpec(bike);

        BikeRideTwo testRun = new BikeRideTwo(rideBike);
        testRun.ride();

        assertEquals(36,testRun.currentSpeed());
    }

    @Test
    void checkCurrentSpeedAfterRideAndStopMethod(){
        BicycleSpecification bike = new BicycleSpecification(BicycleType.Tandem);
        Bicycle rideBike = new BicycleFromSpec(bike);

        BikeRideTwo testRun = new BikeRideTwo(rideBike);
        testRun.ride();

        assertEquals(36,testRun.currentSpeed());
    }

}
