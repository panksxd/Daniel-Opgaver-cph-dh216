import java.util.ArrayList;

public class Student
{
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    Student(String name)
    {
        this.name = name;
    }

    public void addCourse(Course a)
    {
        courses.add(a);
    }

    public String toString()
    {
       return "Student: "+name + " is involved with the following courses: "+ courses;
    }
}
