package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
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
    // Tandem Tests
    @Test
    public void shouldAccelerateTandem(){
        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12,bicycle.currentSpeed());
    }

    @Test
    public void shouldBrakeTandem(){
        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(5,bicycle.currentSpeed());
    }

    @Test
    public void shouldStopTandem(){
        Bicycle bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0,bicycle.currentSpeed());
    }
    @Test
    public void shouldGetCurrentSpeedTandem(){
        Bicycle bicycle = new Tandem();
        assertEquals(0,bicycle.currentSpeed());
    }
}
