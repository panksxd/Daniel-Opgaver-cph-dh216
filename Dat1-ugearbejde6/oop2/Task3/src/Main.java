import java.util.ArrayList;

public class Main
{
    static ArrayList<Person> persons = new ArrayList<>();
    static ArrayList<String> canTeach = new ArrayList<>();

    static ArrayList<String> cannotTeach = new ArrayList<>();
   static ArrayList<String> passedCourses = new ArrayList<>();
   static ArrayList<String> notPassed = new ArrayList<>();

    public static void main(String[] args)
    {
        passedCourses.add("java 1.0");
        canTeach.add("java 1.0");

        Teacher t = new Teacher("Dorith", canTeach);
        Teacher t1 = new Teacher("Dorith", canTeach);
        Teacher t2 = new Teacher("Dorith", canTeach);
        Teacher t3 = new Teacher("Dorith", cannotTeach);
        Student s = new Student("Dorith", passedCourses);
        Student s1 = new Student("Dorith", passedCourses);
        Student s2 = new Student("Dorith", passedCourses);
        Student s3 = new Student("Dorith", passedCourses);
        Student s4 = new Student("Dorith", notPassed);
        persons.add(t);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);
        persons.add(s);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);

        for(int i = 0; i < persons.size(); i++)
        {
            boolean b = persons.get(i).addCourse("java 1.0");
            System.out.println(b);
            if(b == false)
            {
                if(persons.get(i) instanceof Student)
                {
                    System.out.println(persons.get(i).name+" har allerede bestået dette kursus");
                }
                if(persons.get(i) instanceof Teacher)
                {
                    System.out.println(persons.get(i).name+" er super inkompetent og må ikke undervise");
                }

            }
            if(b == true)
            {
                if(persons.get(i) instanceof Student)
                {
                    System.out.println(persons.get(i).name+" er nu skrevet op til dette kursus");
                }
                if(persons.get(i) instanceof Teacher)
                {
                    System.out.println(persons.get(i).name+" er godtkendt til at undervise i dette kursus");
                }
            }
        }
    }
}