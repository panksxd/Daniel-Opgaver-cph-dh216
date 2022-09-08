int input = abs(-45);
float x = input;

while (input > x/2)
{
  println(input);
  input -= 1;
}
while (input == x/2)
{
  println("HALF!");
  input -= 1;
}
while (input < x/2 && input > 6)
{
  println(input);
  input -= 1;
}
while (input == 6)
{
  println("six");
  input -= 1;
}
while (input < 6 && input >= 0)
{
  println(input);
  input -= 1;
}
