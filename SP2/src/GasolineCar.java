public class GasolineCar extends AFuelCar
{

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String type)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, type);

    }

    public int getRegistrationFee()
    {
        if(this.kmPrLitre >= 20)
        {
            return 330;
        }
        if(this.kmPrLitre < 20 && this.kmPrLitre >= 15)
        {
            return 1050;
        }
        if(this.kmPrLitre < 15 && this.kmPrLitre >= 10)
        {
            return 2340;
        }
        if(this.kmPrLitre < 10 && this.kmPrLitre >= 5)
        {
            return 5500;
        }
        if(this.kmPrLitre < 5)
        {
            return 10470;
        }
        return 330;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }


}
