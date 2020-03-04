package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTest {

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
    // MountainBike Tests
    @Test
    public void shouldAccelerateMountainBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11,bicycle.currentSpeed());
    }

    @Test
    public void shouldBrakeMountainBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7,bicycle.currentSpeed());
    }

    @Test
    public void shouldStopMountainBike(){
        Bicycle bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0,bicycle.currentSpeed());
    }
    @Test
    public void shouldGetCurrentSpeedMountainBike(){
        Bicycle bicycle = new RoadBike();
        assertEquals(0,bicycle.currentSpeed());
    }
}
