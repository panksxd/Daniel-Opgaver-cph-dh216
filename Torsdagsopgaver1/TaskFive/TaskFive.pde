void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    String output = "i is greater than "+max+".";   
    println(output);
  }
  
  
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
boolean weekend = false;
int weekDay = 0;
void MethodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  
  int whenWeekend = 5 - weekDay;
 
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  
  // Print the name of the weekday here: 


  
  if(weekDay == 0)
  {
    println("its monday time to study!");
  }
  else if(weekDay == 1)
  {
    println("tuuuuuuueeesessdayyyyyy");
  }
  else if(weekDay == 2)
  {
    println("it's wedensday my dudes");
  }
  else if(weekDay == 4)
  {
    println("friday friday gotta get down on friday");
  }
  else if(weekDay == 5)
  {
    println("saturday, the day with the hangover");
  }
  else if(weekDay == 6)
  {
    println("sunday the second day with a hangover if you are over 30");
  }
 

    
  // Print if it is weekend here:
  if(weekend)
  {
    println("wuhuuuuuuuu the weekend is upon us!");
  }
  else
  {
    println("no it's stil not the weekend you will have to wait for "+whenWeekend+" days!");
  }
  
}
