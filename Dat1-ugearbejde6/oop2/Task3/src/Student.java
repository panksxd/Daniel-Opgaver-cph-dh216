import java.util.ArrayList;

public class Student extends Person
{
    private ArrayList<String> passedCourses = new ArrayList<>();

    private ArrayList<String> currentCourses = new ArrayList<>();



    Student(String name, ArrayList<String> passedCourses)
    {
        super(name);
        this.currentCourses = currentCourses;
        this.passedCourses = passedCourses;

    }
    @Override
    boolean addCourse(String course)
    {
        for(int i = 0; i < passedCourses.size(); i++)
        {
                if(passedCourses.get(i).equalsIgnoreCase(course))
                {
                    return false;
                }

        }
        currentCourses.add(course);
        return true;
    }

}
