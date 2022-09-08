color red = color(255,0,0);
color yellow = color(255,255,0);
color green = color(0,255,0);
color bg = color(255);
color grey = color(175, 175, 175);
int go = 1;
void setup()
{
  fullScreen();
  frameRate(1);
}

void draw()
{
  background(bg);
  // background for the stoplight
  fill(0);
  rectMode(CENTER);
  rect(width/2, height/2, 200, 600);
  if(go == 1)
  {
    //red ligth on yellow, green off
    fill(red);
    ellipse(width/2, height/2 - 150, 100, 100);
    fill(grey);
    ellipse(width/2, height/2, 100, 100);
    ellipse(width/2, height/2 + 150, 100, 100);
  }
  else if(go == 2)
  {
   //red light, yellow light on, green off
    fill(red);
  ellipse(width/2, height/2 - 150, 100, 100);
  fill(yellow);
  ellipse(width/2, height/2, 100, 100);
  fill(grey);
  ellipse(width/2, height/2 + 150, 100, 100);
  }
  
  else if(go == 3)
  {
    fill(green);
    ellipse(width/2, height/2 + 150, 100, 100);
    fill(grey);
    ellipse(width/2, height/2, 100, 100);
    ellipse(width/2, height/2 - 150, 100, 100);
  }
  if(go == 1)
  {
    go += 1;
  }
  else if(go == 2)
  {
    go += 1;
  }
  else if(go == 3)
  {
    go = 1;
  }
}
