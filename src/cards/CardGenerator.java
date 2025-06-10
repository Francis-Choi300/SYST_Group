/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cards;

import cards.Card;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Yoon-Ho Choi. Add your name here when editing code
 */
public class CardGenerator {
    
    
    
    //creates a number of cards and inserts them into "hand"
    public ArrayList<Card> generateCards ( int numCards){
        ArrayList<Card> hand = new ArrayList<Card>();
        
        Random rnd = new Random();
            int suitLength = Card.Suit.values().length; //3
            int valueLength = Card.Value.values().length; //12
                    
        for (int i =0; i< numCards; i++)
        {Card c = new Card();
        
            int rndSuit = rnd.nextInt(suitLength); // 0-3
            int rndValue = rnd.nextInt(valueLength); //0-12
            
            c.setValue(Card.Value.values()[rndValue]);
            c.setSuit(Card.Suit.values()[rndSuit]);
            
            hand.add(c);
        }//end for loop
        
        return hand;
    }// end method
    

    
}
