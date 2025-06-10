/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cards;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class User {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private CardGenerator dealer = new CardGenerator(); 
    

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
    
    public void startingHand(int num){
        ArrayList<Card> startHand = this.dealer.generateCards(num);
        this.setHand(startHand);
    }
    
    public void displayHand(){
        for (Card c: hand){
            System.out.println(c);
        }
    }

}
