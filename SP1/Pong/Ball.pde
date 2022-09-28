class Ball
{

  //Initialize everything the ball needs
  float x;
  float y;
  int r;
  
  //The array speeds was made so i could get random numbers without the possibility to go below 1 or above -1 but still have numbers on either side of them.
  float[] speeds = {-3, -2.5, -2, -1.5, -1, 1, 1.5, 2, 2.5, 3};
  float xDirection = speeds[(int)random(6, 10)];
  float yDirection =  speeds[(int)random(2, 8)];
  int score1 = 0;
  int score2 = 0;

  // Ball constructor
  Ball(float tempx, float tempy, int tempr)
  {
    x = tempx;
    y = tempy;
    r = tempr;
  }

  //Draw the ball x: balls center x, y: balls center y and r: balls radius
  void make()
  {
    ellipse(x, y, r, r);
  }

  // Function to make the ball change direction and speed up if player1 succesfully hits it
  void blockPlayer1()
  {
    if (x <= player1.x +10 && y >= player1.y && y <= player1.y + 60)
    {
      xDirection *= - 1.2;
    }
  }

  // Function to make the ball change direction if player2 succesfully hits it
  void blockPlayer2()
  {
    if (x >= player2.x && y >= player2.y && y <= player2.y + 60)
    {
      xDirection *= - 1.2;
    }
  }

  //Balls movement, x moves by xDirection for each frame,
  void movex()
  {
    x += xDirection;
  }

  //Balls movement, y moves by y direction for each frame, also blocks the top and bottom of the screen so the ball doesn't fly off
  void movey()
  {
    y += yDirection;
    if (y >= height - r || y <= 0 +r)
    {
      yDirection *= - 1;
    }
  }

  // Counts the score for each player and resets the ball when it goes out of bounds
  void score()
  {
    if (x > width)
    {
      score1 += 1;
      x = 450;
      y = 150;
      yDirection = speeds[(int)random(2, 8)];
      xDirection = speeds[(int)random(6, 10)];
    }
    if (x < 0)
    {
      score2 += 1;
      x = 450;
      y = 150;
      yDirection = speeds[(int)random(2, 8)];
      xDirection = speeds[(int)random(6, 10)];
    }
  }

  // Sets the left arrow to restart points and ball.
  void keyPressed()
  {
    if (keyCode == LEFT)
    {

      score1 = 0;
      score2 = 0;
      x = 450;
      y = 150;
      yDirection = speeds[(int)random(2, 8)];
      xDirection = speeds[(int)random(6, 10)];
    }
  }
}
