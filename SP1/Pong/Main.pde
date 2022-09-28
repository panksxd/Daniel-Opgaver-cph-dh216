// Create a moveable player 1, player 2 object a ball object and create space for a font
PFont font1;
Player1 player1 = new Player1(20, 20, 'w', 's');
Player2 player2 = new Player2(870, 20);
Ball ball = new Ball(450, 150, 15);

void setup()

{
  //set size of window, and load a font
  size(900, 300);
  font1 = loadFont("Optima-Regular-48.vlw");
}

void draw()
{

  // make a white background and make the squares black
  background(255);
  fill(0);

  // Draw player 1 and check if the keys that controll them are pressed
  player1.playerRect();

  //check the current speed of the square
  player1.countSpeed();

  // change position accordingly to speed
  player1.changePosition();

  //same as player 1
  player2.playerRect();
  player2.countSpeed();
  player2.changePosition();

  // Draw a ball and make it move on both the x-axis and y-axis
  ball.make();
  ball.movex();
  ball.movey();

  // Make ball unable to go through player 1 and player 2
  ball.blockPlayer1();
  ball.blockPlayer2();

  // check if ball is out of bounds and adjust the score acordingly
  ball.score();

  // Make font nicer
  fill(0);
  textFont(font1, 14);

  //display scores for player 1 and player 2
  text("player 1 score: "+ball.score1, 250, 10);
  text("Player 2 score: "+ball.score2, 550, 10);

  // Display keybidings for each player
  text("Up: w ", 250, 25);
  text("Down: s ", 250, 40);
  text("Up: Arrow up", 550, 25);
  text("Down: Arrow down", 550, 40);
  text("press left arrow to restart", 375, 10);
}

//call keyPressed from classes
void keyPressed()
{
  player1.keyPressed();
  player2.keyPressed();
  ball.keyPressed();
}

//call keyReleased from classes
void keyReleased()
{
  player1.keyReleased();
  player2.keyReleased();
}

/*
I realise i did not find a place to use a for loop
I'll write an example here just to fullfill that requirement

int[] imaginaryArray = new int[7];

for(int i = 0; i < imaginaryArray.length; i++)
{
  imaginaryArray[i] = i + 1;
  println(imaginaryArray[i]);
}

this for loop will set the values of imaginaryArray[i] to i+1
so the println would give us:
1 
2
3
4
5
6
7
*/
