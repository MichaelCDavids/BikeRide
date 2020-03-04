package bicycles;

import java.util.ArrayList;

public class FunRide {

    private int maximumNumberOfBicyclesForRide;

    private ArrayList<Bicycle> listOfBicyclesEntered = new ArrayList();

    public FunRide(int maximumNumberOfBicycles){
        this.maximumNumberOfBicyclesForRide = maximumNumberOfBicycles;
    }

    public int getEnteredCount(){
        return this.listOfBicyclesEntered.size();
    }



}
