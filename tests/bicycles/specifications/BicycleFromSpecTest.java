package bicycles.specifications;


import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {

    @Test
    void changeSpeedTest(){
        BicycleSpecification tandem = new BicycleSpecification(BicycleType.Tandem);
        BicycleFromSpec tandemSpecs = new BicycleFromSpec(tandem);

        assertEquals(0,tandemSpecs.currentSpeed());
        tandemSpecs.accelerate();
        assertEquals(12,tandemSpecs.currentSpeed());
        tandemSpecs.brake();
        assertEquals(6,tandemSpecs.currentSpeed());
        tandemSpecs.stop();
        assertEquals(0,tandemSpecs.currentSpeed());

    }

    @Test
    void checkBicycleType(){
        BicycleSpecification roadBike = new BicycleSpecification(BicycleType.RoadBike);
        BicycleFromSpec roadBikeSpecs = new BicycleFromSpec(roadBike);

        assertEquals(BicycleType.RoadBike, roadBikeSpecs.getBicycleType());
    }
}
