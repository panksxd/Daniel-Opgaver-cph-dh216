void setup()
{
  Teacher teach1 = new Teacher("jesper", 32, false);
  Student me = new Student("Daniel", 30, false, "A");
  Student student1 = new Student("Tobias", 21, false, "A");
  
  println(teach1.name);
  println(me.name+ " "+ me.datamatikerTeam);
  println(student1.name+ " " + student1.datamatikerTeam);
}
