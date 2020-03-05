package bicycles.models;

import bicycles.interfaces.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    // MountainBike Tests
    @Test
    public void shouldAccelerateMountainBike(){
        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        assertEquals(5,bicycle.currentSpeed());
    }

    @Test
    public void shouldBrakeMountainBike(){
        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2,bicycle.currentSpeed());
    }

    @Test
    public void shouldStopMountainBike(){
        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0,bicycle.currentSpeed());
    }
    @Test
    public void shouldGetCurrentSpeedMountainBike(){
        Bicycle bicycle = new MountainBike();
        assertEquals(0,bicycle.currentSpeed());
    }
}
