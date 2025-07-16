/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CardGenerator {
    
    public ArrayList<Card> deal(int num){
        
        ArrayList<Card> hand = new ArrayList<Card>();
        
        for (int i=0; i < num ;i++)
            {
                Card card = new Card();
                
                hand.add(card);
            }
        return hand;
    
    }
    
}
