class Player2
{

  //Initialize everything player2 needs
  boolean keyUp, keyDown;
  float ySpeed = 0;
  char up;
  char down;
  float y;
  int x;
  int score = 0;

  //Player1 constructor
  Player2(int tempx, float tempy)
  {
    y = tempy;
    x = tempx;
  }

  //Checks what ySpeed's current value is
  void countSpeed()
  {
    if (keyUp) ySpeed-= 0.5;
    if (keyDown) ySpeed+= 0.5;

    // Make it so the square can't go out the top of the window
    if (y < 0) ySpeed = 2;

    // Make it so the square can't go out of the bottom of the window (i use the number 25 because it gave me the result i wanted, it was pure trial and error with different numbers before i got my dessired outcome)
    if (y > height - 60) ySpeed = 25;
  }

  //Changes Player1's y position with y, afterwards creates "resistance" so it slows downs automatically (Trick i found on google not my own idea)
  void changePosition()
  {
    y+=ySpeed;
    y *= 0.9;
  }

  // Draw the square
  void playerRect()
  {
    rect(x, y, 10, 60);
  }

  //Checks if the chosen keys in this case i use the keyCode UP and DOWN are pressed, if true they will set keyUp/Down/ true
  void keyPressed()
  {
    if (keyCode == UP)
    {
      keyUp = true;
    }
    if (keyCode == DOWN)
    {
      keyDown = true;
    }
  }
  
  //Checks if the chosen keys in this case i use the keyCode UP and DOWN, are released, if true they will set keyUp/Down false
  void keyReleased()
  {
    if (keyCode == UP)
    {
      keyUp = false;
    }
    if (keyCode == DOWN)
    {
      keyDown = false;
    }
  }
}
