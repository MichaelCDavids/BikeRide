package bicycles.models;

import bicycles.interfaces.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {
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
