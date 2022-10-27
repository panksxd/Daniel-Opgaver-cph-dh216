public abstract class AFuelCar extends ACar implements Car
{
    protected int kmPrLitre;
    protected String type;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String type)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
        this.type = type;
    }

    public String getFuelType()
   {
       return this.type;
   }
   public int getKmPrLitre()
   {
       return kmPrLitre;
   }
   @Override
    public String toString()
    {
      return  super.toString() + " "+ this.getFuelType();
    }

}
