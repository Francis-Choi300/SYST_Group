package card1;


import card1.Card;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Stefan Jr
 */
public class CardGenerator {
    
    
    public ArrayList<Card> generateCards ( int numCards){
      ArrayList<Card> hand = new ArrayList<>();
      
      Random rnd = new Random();
        int suitLength = Card.Suit.values().length;
        int valueLength = Card.Value.values().length;
        
        for (int i = 0; i < numCards; i++)
        {Card c = new Card();
        
          int rndSuit = rnd.nextInt(suitLength);
          int rndValue = rnd.nextInt(valueLength);
          
          c.setValue(Card.Value.values()[rndValue]);
          c.setSuit(Card.Suit.values()[rndSuit]);
          
          hand.add(c);
        }
        
        return hand;
    }

    
}
