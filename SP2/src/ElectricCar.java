public class ElectricCar extends ACar implements Car
{
    private int batteryCapacity;
    private int maxRange;

    private  String type;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, String type)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.type = type;
    }

    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public int getMaxRange()
    {
        return maxRange;
    }

    public int getWhPrKm()
    {
        return maxRange/batteryCapacity;
    }
    public int getRegistrationFee()
    {
        double kmL = 0;
        kmL = this.getWhPrKm()/91.25;
        kmL = 100/kmL;
        if(kmL >= 20)
        {
            return 330;
        }
        if(kmL < 20 && kmL >= 15)
        {
            return 1050;
        }
        if(kmL < 15 && kmL >= 10)
        {
            return 2340;
        }
        if(kmL < 10 && kmL >= 5)
        {
            return 5500;
        }
        if(kmL < 5)
        {
            return 10470;
        }
        return 330;
    }


    @Override
    public String toString()
    {
        return super.toString()+ " " + this.type;
    }
}
