import java.util.Scanner;
import java.util.ArrayList;

public class Menu
{
    private ArrayList<String> options;


    Menu(ArrayList<String> options)
    {
        this.options = options;
    }

    public String showMenu()
    {
        System.out.println("Type a number to choose "+ options);
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        return choice;

    }
}

