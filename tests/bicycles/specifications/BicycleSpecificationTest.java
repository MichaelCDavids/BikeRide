package bicycles.specifications;

import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {

    @Test
    void checkBicycleTypeForRoadBike(){
        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        assertEquals(BicycleType.RoadBike, roadBike.getBicycleType());
    }

    @Test
    void checkRoadBikeAcceleration(){
        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        assertEquals(10, roadBike.getAccelerationSpeed());
    }

    @Test
    void checkRoadBikeBrake(){
        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        assertEquals(-4, roadBike.getBrakeSpeed());
    }

    @Test
    void checkBicycleTypeForMountainBike(){
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        assertEquals(BicycleType.MountainBike, mountainBike.getBicycleType());
    }

    @Test
    void checkMountainBikeAcceleration(){
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        assertEquals(7, mountainBike.getAccelerationSpeed());
    }

    @Test
    void checkMountainBikeBrake(){
        BicycleSpecification mountainBike = new BicycleSpecification(BicycleType.MountainBike);
        assertEquals(-3, mountainBike.getBrakeSpeed());
    }
    @Test
    void checkBicycleTypeForTandem(){
        BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);
        assertEquals(BicycleType.Tandem, tandemBike.getBicycleType());
    }

    @Test
    void checkTandemAcceleration(){
        BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);
        assertEquals(12, tandemBike.getAccelerationSpeed());
    }

    @Test
    void checkTandemBrake(){
        BicycleSpecification tandemBike = new BicycleSpecification(BicycleType.Tandem);
        assertEquals(-6, tandemBike.getBrakeSpeed());
    }
}
