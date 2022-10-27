public class DieselCar extends AFuelCar implements Car
{


   private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter, String type)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre,type);
        this.particleFilter = particleFilter;
    }

    private boolean hasParticleFilter()
    {
        return particleFilter;
    }

    public int getRegistrationFee()
    {
        int feeTotal = 0;
        if (this.kmPrLitre >= 20)
        {
            feeTotal = 330 + 130;
        }
        if (this.kmPrLitre < 20 && this.kmPrLitre >= 15)
        {
            feeTotal = 1050 + 1390;
        }
        if (this.kmPrLitre < 15 && this.kmPrLitre >= 10)
        {
            feeTotal = 2340 + 1850;
        }
        if (this.kmPrLitre < 10 && this.kmPrLitre >= 5)
        {
            feeTotal = 5500 + 2770;
        }
        if (this.kmPrLitre < 5)
        {
            feeTotal = 10470 + 15260;
        }
        if(this.particleFilter)
        {
            feeTotal += 1000;
        }
        return feeTotal;
    }

    @Override
   public String toString()
    {
        return super.toString();
    }
}
