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
        if(isNormal(b1))
        {
            System.out.println("this is a normal building.");
        }
        else
        {
            System.out.println("this building is weird.");
        }
    }
    static int count(Building b1)
    {
        int lampsTotal = 0;
        for(Room r : b1.getRooms())
        {
            lampsTotal += r.getNumberOfLamps();
        }

        System.out.println(lampsTotal);
        return lampsTotal;
    }
    static boolean isNormal(Building b1)
    {
        return b1.getNumberOfFloors()< b1.getRooms().size();

    }
}
