package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunRideTest {
    @Test
    void checkFunRideAcceptMethod(){
        // RoadBike
        BicycleSpecification oneBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleOne = new BicycleFromSpec(oneBicycle);
        // MountainBike
        BicycleSpecification twoBicycle = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycleTwo = new BicycleFromSpec(twoBicycle);
        // Tandem
        BicycleSpecification threeBicycle = new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycleThree = new BicycleFromSpec(threeBicycle);
        // Tandem
        BicycleSpecification fourBicycle = new BicycleSpecification( BicycleType.Tandem);
        Bicycle bicycleFour = new BicycleFromSpec(fourBicycle);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycleOne);
        funRide.accept(bicycleTwo);
        funRide.accept(bicycleThree);
        funRide.accept(bicycleFour);

        assertEquals(3,funRide.getEnteredCount());
    }

    @Test
    void checkFunRideAcceptMethodNoDuplicates(){
        // RoadBike
        BicycleSpecification oneBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleOne = new BicycleFromSpec(oneBicycle);
        // MountainBike
        BicycleSpecification twoBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleTwo = new BicycleFromSpec(twoBicycle);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycleOne);
        funRide.accept(bicycleTwo);
        funRide.accept(bicycleTwo);
        funRide.accept(bicycleTwo);

        assertEquals(2,funRide.getEnteredCount());
    }

    @Test
    void checkRideMethod(){
        // RoadBike
        BicycleSpecification oneBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleOne = new BicycleFromSpec(oneBicycle);

        BikeRideOne bikeRideOne = new BikeRideOne(bicycleOne);
        bikeRideOne.ride();

        assertEquals(32,bikeRideOne.currentSpeed());
    }

    @Test
    void checkCurrentSpeedMethod(){
        // RoadBike
        BicycleSpecification oneBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleOne = new BicycleFromSpec(oneBicycle);

        BikeRideOne bikeRideOne = new BikeRideOne(bicycleOne);
        bikeRideOne.ride();

        assertEquals(32,bikeRideOne.currentSpeed());
    }

    @Test
    void checkGetEnteredCountMethod(){
        // RoadBike
        BicycleSpecification oneBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleOne = new BicycleFromSpec(oneBicycle);
        // MountainBike
        BicycleSpecification twoBicycle = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycleTwo = new BicycleFromSpec(twoBicycle);
        // Tandem
        BicycleSpecification threeBicycle = new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycleThree = new BicycleFromSpec(threeBicycle);

        // RoadBike
        BicycleSpecification fourBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleFour = new BicycleFromSpec(fourBicycle);
        // MountainBike
        BicycleSpecification fiveBicycle = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycleFive = new BicycleFromSpec(fiveBicycle);
        // Tandem
        BicycleSpecification sixBicycle = new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycleSix = new BicycleFromSpec(sixBicycle);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycleOne);
        funRide.accept(bicycleTwo);
        funRide.accept(bicycleThree);
        funRide.accept(bicycleFour);
        funRide.accept(bicycleFive);
        funRide.accept(bicycleSix);

        assertEquals(5,funRide.getEnteredCount());


    }

    @Test
    void checkGetEnteredCountForTypeMethod(){
        // RoadBike
        BicycleSpecification oneBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleOne = new BicycleFromSpec(oneBicycle);
        // MountainBike
        BicycleSpecification twoBicycle = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycleTwo = new BicycleFromSpec(twoBicycle);
        // Tandem
        BicycleSpecification threeBicycle = new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycleThree = new BicycleFromSpec(threeBicycle);

        // RoadBike
        BicycleSpecification fourBicycle = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycleFour = new BicycleFromSpec(fourBicycle);
        // MountainBike
        BicycleSpecification fiveBicycle = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycleFive = new BicycleFromSpec(fiveBicycle);
        // Tandem
        BicycleSpecification sixBicycle = new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycleSix = new BicycleFromSpec(sixBicycle);

        FunRide funRide = new FunRide(5);

//        System.out.println(bicycleOne);

        funRide.accept(bicycleOne);
        funRide.accept(bicycleTwo);
        funRide.accept(bicycleThree);
        funRide.accept(bicycleFour);
        funRide.accept(bicycleFive);
        funRide.accept(bicycleSix);

        assertEquals(2,funRide.getCountForType(BicycleType.MountainBike));
        assertEquals(1,funRide.getCountForType(BicycleType.Tandem));
        assertEquals(2,funRide.getCountForType(BicycleType.RoadBike));

    }


}