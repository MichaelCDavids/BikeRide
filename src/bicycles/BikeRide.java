package bicycles;

public class BikeRide {

    Bicycle bicycle;

    BikeRide(Bicycle bike){
        this.bicycle = bike;
    }

    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }

    public static void main(String[] args){
//        Bicycle bicycle = new Bicycle();
//        BikeRide bikeRide = new BikeRide(bicycle);
//        bikeRide.ride();
//        System.out.println(bikeRide.currentSpeed());
    }
}
