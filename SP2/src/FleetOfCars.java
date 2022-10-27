

import java.util.ArrayList;
import java.util.Arrays;

public class FleetOfCars
{
    public ArrayList<Car> fleet;

    public FleetOfCars(ArrayList<Car> fleet)
    {
        this.fleet = fleet;
    }

    void addCar(Car car)
    {
        fleet.add((car));
    }
    int getTotalRegistrationFeeForFleet()
    {
        int total = 0;
        for(int i = 0; i < fleet.size(); i++)
        {
            total += fleet.get(i).getRegistrationFee();
        }
        return total;
    }

    @Override
    public String toString()
    {
        for(int i = 0; i < fleet.size(); i++)
        {
            System.out.println(fleet.get(i));
        }
        return "";
    }
}
