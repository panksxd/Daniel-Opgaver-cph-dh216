int board[][] = new int[8][8];
int x = 0;
int y = 0;

void setup()
{
  fullScreen();
  for(int i = 0; i < board.length; i++)
  {
    for(int l = 0; l < board.length; l++)
    {
      if(l%2 == 0 && i%2 == 0)
      {
        board[l][i]   = 0;
      }
    
      else if(l%2 == 1 && i%2 == 1)
      {
        board[l][i] = 0;
      }
      else
      {
        board[l][i] = 1;
      }
    }
  }

  for(int i = 0; i < board.length; i++)
  {
    for(int l = 0; l < board.length; l++)
    {
      if(board[l][i] == 0)
      {
        fill(0);
        rect(x, y, width/8, height/8);
        x += width/8;
      }
      else if(board[l][i] == 1)
      {
        fill(255);
        rect(x, y, width/8, height/8);
        x += width/8;
      }
    }
    y = y + height/8;
    x = 0;
  }
}
