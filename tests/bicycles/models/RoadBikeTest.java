package bicycles.models;

import bicycles.interfaces.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {
    // RoadBike Tests
    @Test
    public void shouldAccelerateRoadBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11,bicycle.currentSpeed());
    }

    @Test
    public void shouldBrakeRoadBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7,bicycle.currentSpeed());
    }

    @Test
    public void shouldStopRoadBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0,bicycle.currentSpeed());
    }
    @Test
    public void shouldGetCurrentSpeedRoadBike(){
        Bicycle bicycle = new RoadBike();
        assertEquals(0,bicycle.currentSpeed());
    }
}
