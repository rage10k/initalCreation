package mainDeck;
import java.util.Random;
/**
 *
 * @author Richard Emmanuel
 */


public class DeckOfCards
{
  private Card deck[];
  private int currentCard;
  private final int NUMBER_OF_CARDS = 52;
  private Random randomNumber;
  
  
  
  public DeckOfCards()
  {
    String faces[] = {"Ace","Deuce","Three","Four","Five","Six","Seven","eight","nine","Ten","Jack","Queen","King"};
    String suits[] = {"Hearts","Diamonds","Clubs","spades"};
    
    deck = new Card[NUMBER_OF_CARDS];
    currentCard = 0;
    randomNumber = new Random();
    
    for (int count = 0; count < deck.length; count++)
    
    deck[count] = new Card(faces[count%13], suits[count/13]);
  }// end Constructor
    
  
  
    public void shuffle()
    {
      currentCard = 0;
      for(int first = 0; first < deck.length; first++)
      {
        int secound = randomNumber.nextInt(NUMBER_OF_CARDS);
        Card temp = deck[first];
        deck[first] = deck[secound];
        deck[secound] = temp;
      }
    }
    
    
    
    
    public Card dealCard()
    {
      if(currentCard < deck.length)
      
        return deck[currentCard++];
      
      else
      
        return null;
      
    }//end dealCard
    
 }//end DeckOfCards
