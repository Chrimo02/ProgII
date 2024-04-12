package Lektion16.Schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    //Diagonale nach oben rechts
    for (int i = 1; i <= 8; i++) {
      int newX = x + i;
      int newY = y + i;
      if (newX <= 8 && newY <= 8) {
        brett.markiereFeld(newX, newY);
      }
      else break;
    }
    // Diagonale nach oben links
    for (int i = 1; i <= 8; i++) {
      int newX = x - i;
      int newY = y + i;
      if (newX >= 1 && newY <= 8) {
        brett.markiereFeld(newX, newY);
      }
      else break;
    }

    // Diagonale unten rechts
    for (int i = 1; i <= 8; i++) {
      int newX = x + i;
      int newY = y - i;
      if (newX <= 8 && newY >= 1) {
        brett.markiereFeld(newX, newY);
      }
      else break;
    }

    // Diagonale unten links
    for (int i = 1; i <= 8; i++) {
      int newX = x - i;
      int newY = y - i;
      if (newX >= 1 && newY >= 1) {
        brett.markiereFeld(newX, newY);
      }
      else break;
    }
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x  ");
        else System.out.print("o  ");
      }
      System.out.println();
    }
  }
}
