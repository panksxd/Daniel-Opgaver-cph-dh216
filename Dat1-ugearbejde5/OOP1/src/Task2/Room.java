package Task2;

public class Room
{
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfLamps;

    public Room(int numberOfDoors, int numberOfWindows, int numberOfLamps)
    {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }

    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }
}
