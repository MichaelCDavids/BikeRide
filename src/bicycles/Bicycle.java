package bicycles;



/**
 * Represents the Bicycle functions
 *
 */
public class Bicycle {

    // Speed variable
    int speed = 0;


    /**
     *  this method will increase the speed by 5
     * */
    public void accelerate(){
        this.speed +=  5;
    }
    /**
     *  this method will increase the speed by 5
     * */
    public void brake(){
        this.speed -=  5;
    }
    /**
     *  this method will increase the speed by 5
     * */
    public int currentSpeed(){
        return this.speed;
    }
    /**
     *  this method will increase the speed by 5
     * */
    public void stop(){
        this.speed = 0;
    }

}
