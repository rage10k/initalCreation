package mainDeck;

/**
 *
 * @richard emmanuel
 */
public class Card
{
    
  private String face;
  private String suit;
  
  
  
  
  public Card(String cardFace, String cardSuit)
  {
    this.face = cardFace;
    this.suit = cardSuit;
  }
  
  
  
  @Override
  public String toString()
  {
    return face + " of " + suit;
  }  
}