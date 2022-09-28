class Player1
{

  //Initialize everything player1 needs
  boolean keyUp, keyDown;
  float ySpeed = 0;
  char up;
  char down;
  int score = 0;
  float y;
  int x;

  //Player1 constructor
  Player1(int tempx, float tempy, char tempup, char tempdown)
  {
    y = tempy;
    up = tempup;
    down = tempdown;
    x = tempx;
  }

  //Checks what ySpeed's current value is
  void countSpeed()
  {
    if (keyUp) ySpeed-= 0.5;
    if (keyDown) ySpeed+= 0.5;

    // make it so the square cant go out the top of the window
    if (y < 0) ySpeed = 2;

    // make it so the square cant go out of the bottom of the window (i use the number 25 because it gave me the result i wanted, it was pure trial and error with different numbers before i got my dessired outcome)
    if (y > height - 60) ySpeed = 25;

    if (keyUp) ySpeed-= 0.5;
    if (keyDown) ySpeed+= 0.5;
  }

  //Changes Player1's y position with y, afterwards creates "resistance" so it slows downs automatically (Trick i found on google not my own idea)
  void changePosition()
  {
    y+=ySpeed;
    y *= 0.9;
  }

  //Draw the Square
  void playerRect()
  {
    rect(x, y, 10, 60);
  }

  //Checks if the chosen keys in this case w and s are pressed, if true they will set keyUp/Down/ true
  void keyPressed()
  {
    if (key == up)
    {
      keyUp = true;
    }
    if (key == down)
    {
      keyDown = true;
    }
  }

  //Checks if the chosen keys in this case w and s are released, if true they will set keyUp/Down false
  void keyReleased()
  {
    if (key == up)
    {
      keyUp = false;
    }
    if (key == down)
    {
      keyDown = false;
    }
  }
}
