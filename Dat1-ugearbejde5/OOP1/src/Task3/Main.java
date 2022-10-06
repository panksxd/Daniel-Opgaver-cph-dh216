package Task3;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args)
    {
       Customer c1 = new Customer("Daniel", "Trelborg", "panksxd");
       Customer c2 = new Customer("Daniel2", "Trelborg2", "panksxd2");
       Customer c3 = new Customer("Daniel3", "Trelborg3", "panksxd3");
       Customer c4 = new Customer("Daniel4", "Trelborg4", "panksxd4");
       Customer c5 = new Customer("Daniel5", "Trelborg5", "panksxd5");
       Customer c6 = new Customer("Daniel6", "Trelborg6", "panksxd6");
       customers.add(c1);
       customers.add(c2);
       customers.add(c3);
       customers.add(c4);
       customers.add(c5);
       customers.add(new Customer("Daniel6", "trelborg6", "panksxd"));
       printCustomers();

    }
    static void printCustomers()
    {

        for(int i = 0; i < customers.size(); i++)
        {
            System.out.println(customers.get(i));
        }

    }
}
