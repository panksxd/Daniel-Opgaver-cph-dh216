int sum = 0;
int[] numbers = new int[3];
String[] strings = {"hejsa", "sup", "tadaa", "her er en til"} ;
boolean[] booleans = {false, false, true, false} ;

void setup()
{
  //set numbers in numbers
  numbers[0] = 22;
  numbers[1] = 4;
  numbers[2] = 4;
  // call function printstrings and have it print strings
  printstrings(strings);
  //call total on number[] to get the total of all numbers in f
  println(total(numbers));
  sum = 0;
  //call avr on numbers[] to get the average number
  println(avr(numbers));
  sum = 0;
  order(numbers);
  for(int i = 0; i < numbers.length; i++)
  {
    println(numbers[i]);
  }
  
  
}

void printstrings(String[] a)
{
 
  for(int i = 0; i < a.length; i++)
  println(a[i]);
}


int total(int[] a)
{ 
  for(int i = 0; i < a.length; i++)
  {
   sum += a[i];
    }
  return sum;
}

float avr(int[] a)
{
  for(int i = 0; i < a.length; i++)
  {
    sum += a[i];
  }
  return sum/a.length;
}

void order(int[] a)
{
  int temp = 0;
  for(int i = 0; i < a.length; i++)
  {
    for(int l = 0; l < a.length; i++)
    {
      if(a[l] > a[l+1])
      {
        temp = a[l];
        a[l] = a[l+1];
        a[l+1] = temp;
      }
      else
      {
        a[l] = a[l];
        a[l+1] = a[l+1];
      }
    }
  }
  }
