package Task2;

import java.util.ArrayList;
public class Main
{


    public static void main(String[] args)
    {
        Room r1 = new Room(4, 0, 1);
        Room r2 = new Room(3, 5, 4);
        Room r3 = new Room(1, 10, 50);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        Building b1 = new Building(rooms, 1, 1, false);
        count(b1);
        System.out.println(isNormal(b1));

    }
    static int count(Building b1)
    {
        int lampsTotal = 0;
        for(int i = 0; i < b1.getRooms().size(); i++)
        {

            lampsTotal += b1.getRooms().get(i).getNumberOfLamps();

        }
        System.out.println(lampsTotal);
        return lampsTotal;
    }
    static String isNormal(Building b1)
    {
        if(b1.getNumberOfFloors()< b1.getRooms().size())
        {
            return "This is a normal building";
        }
        return "This is an odd building";
    }
}
