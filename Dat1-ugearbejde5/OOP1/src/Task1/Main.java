package Task1;

public class Main
{
    public static void main(String[] args)
    {

        Driver d1 = new Driver("Daniel", 30);
        Car c1 = new Car("Toyota", "Yaris", 2000, "Hatcback 3 doors");
        c1.setDriver(d1);
        System.out.println(c1.toString() + d1.toString());
        Car c2 = new Car("Tesla", "s3", 2022, "who knows");
        c2.setDriver(d1);
        System.out.println(c2.toString() + d1.toString());
    }
}
