package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTest {
    @Test
    public void shouldAccelerate(){
        Bicycle bike = new Bicycle();
        bike.accelerate();
        assertEquals(5,bike.currentSpeed());
    }
}
