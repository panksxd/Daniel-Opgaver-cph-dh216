import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Cafe
{
    public ArrayList<String> coffeeMenu = new ArrayList<>();






    void loadMenuData()
    {
        File file = new File("coffees.txt");

            try
            {
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine())
                {
                    coffeeMenu.add(scan.nextLine());
                }
            } catch (FileNotFoundException ex)
            {
                System.out.println("File not found. dumbass");
            }

    }
}
