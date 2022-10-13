import java.util.ArrayList;

public class Teacher extends Person
{
    private ArrayList<String> currentCourses = new ArrayList<>();

    private ArrayList<String> canTeach = new ArrayList<>();
    Teacher(String name, ArrayList<String> canTeach)
    {
        super(name);
        this.canTeach = canTeach;

    }
    @Override
    boolean addCourse(String course)
    {
        for(int i = 0; i < canTeach.size(); i++)
        {
            if(canTeach.get(i).equalsIgnoreCase(course))
                {
                    currentCourses.add(course);
                    return true;
                }

        }
        return false;
    }

}
