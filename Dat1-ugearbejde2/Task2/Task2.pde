boolean happy = true;

 void setup() 
 {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
}

boolean iAmHappy()
{
     return happy;
}

int sum(int a, int b)
{
  return a + b;
}

String uCase(String a)
{
  return a = a.toUpperCase();
}

boolean firstletter(String a)
{
  return Character.isUpperCase(a.charAt(0));
}
