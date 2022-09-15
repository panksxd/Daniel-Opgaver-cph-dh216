Student[] students = new Student[10];

void setup()
{
 
/*for(int i = 0; i < 10; i++)
students[i] = new Student("kirsten", i+20, false, "a");*/
students[0] = new Student("katrine", 22, true, "a");
students[1] = new Student("morten", 22, false, "a");
students[2] = new Student("hanne", 22, true, "a");
students[3] = new Student("thor", 22, false, "a");
students[4] = new Student("supermand", 22, false, "a");
students[5] = new Student("42", 22, true, "a");
students[6] = new Student("theis", 22, false, "a");
students[7] = new Student("mikal", 22, false, "a");
students[8] = new Student("diluckshan", 22, false, "a");
students[9] = new Student("Fie", 22, true, "a");

whodat(students, 8);
whatsyournumber(students, "Fie");
}

String whodat(Student[] a, int b)
{
  println(a[b].name);
  return a[b].name;
}

int whatsyournumber(Student[] a, String b)
{
  for(int i = 0; i < a.length; i++)
  {
    if(b == a[i].name)
    {
    println(i);
    return i;
    }
  }
  return 0;
}
