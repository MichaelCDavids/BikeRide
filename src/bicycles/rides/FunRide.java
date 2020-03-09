package bicycles.rides;

import bicycles.interfaces.Bicycle;
import bicycles.models.BicycleType;

import java.util.ArrayList;
import java.util.List;


public class FunRide  {

    private int maximumNumberOfBicyclesForRide;

    private List<Bicycle> listOfEnteredBicycles = new ArrayList<Bicycle>();



    public FunRide(int maximumNumberOfBicycles){
        this.maximumNumberOfBicyclesForRide = maximumNumberOfBicycles;
    }

    public int getEnteredCount(){
        return listOfEnteredBicycles.size();
    }

    public int getCountForType(BicycleType type){
        int count = 0;
        for (Bicycle bicycle: listOfEnteredBicycles) {
            if(bicycle.getBicycleType() == type){
                count++;
            }
        }
        return count;
    }

    public void accept(Bicycle bicycle){
        if(listOfEnteredBicycles.size() < maximumNumberOfBicyclesForRide && !listOfEnteredBicycles.contains(bicycle)){
            listOfEnteredBicycles.add(bicycle);
        }
    }
}
