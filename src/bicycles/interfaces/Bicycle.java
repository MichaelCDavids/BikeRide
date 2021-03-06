package bicycles.interfaces;

import bicycles.models.BicycleType;

public interface Bicycle {
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
    BicycleType getBicycleType();
}
