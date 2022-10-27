import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Car> fleetList = new ArrayList<>();
        FleetOfCars fleetOfCars = new FleetOfCars(fleetList);
        GasolineCar gas1 = new GasolineCar("hf 12 345", "Toyota", "Yaris", 5, 21, "Gasoline");
        GasolineCar gas2 = new GasolineCar("hf 12 345", "Toyota", "Yaris", 5, 14, "Gasoline");
        GasolineCar gas3 = new GasolineCar("hf 12 345", "Toyota", "Yaris", 5, 4, "Gasoline");
        DieselCar diesel1 = new DieselCar("bg 12 345", "Skoda", "Fabia", 5, 30, true, "Diesel");
        DieselCar diesel2 = new DieselCar("bg 12 345", "Skoda", "Fabia", 5, 16, true, "Diesel");
        DieselCar diesel3 = new DieselCar("bg 12 345", "Skoda", "Fabia", 5, 3, false, "Diesel");
        ElectricCar el1 = new ElectricCar("wp 12 345", "Tesla", "S", 5, 700, 1000000, "Electric");
        ElectricCar el2 = new ElectricCar("wp 12 345", "Tesla", "3", 5, 700, 6000000, "Electric");
        ElectricCar el3 = new ElectricCar("wp 12 345", "Tesla", "X", 5, 400, 50000, "Electric");
        fleetOfCars.addCar(gas1);
        fleetOfCars.addCar(gas2);
        fleetOfCars.addCar(gas3);
        fleetOfCars.addCar(diesel1);
        fleetOfCars.addCar(diesel2);
        fleetOfCars.addCar(diesel3);
        fleetOfCars.addCar(el1);
        fleetOfCars.addCar(el2);
        fleetOfCars.addCar(el3);
        fleetOfCars.toString();
        System.out.println("The total registration fee for this fleet is: "+ fleetOfCars.getTotalRegistrationFeeForFleet() +"Kr");
    }
}

// min formel for at regne km/l for elektroniske biler er way off, men koden er rigtig nok