/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cards;

import java.util.Objects;

/**
 *
 * @author Yoon-Ho Choi. add your name here when adding code
 */
public class Card {

    public enum Suit {HEART, DIAMOND, SPADE, CLUB};
    public enum Value {ACE, TWO, THREE,FOUR, FIVE , SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    private Suit suit;
    private Value value;
    private int index;
 
    
    //No args Constructor
    public Card(){}
    //Constructor (suit and value)
    public Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
        }
    
//    //Constructor index
//    public Card(int index){
//        this.index = index;
//    
//        if (index >0){
//            if (index < 14)
//                {this.suit = "hearts";
//                 this.value = index;}
//            else if (index < 27 )
//                {this.suit = "diamonds";
//                this.value = index - 13;}
//            else if (index < 40)
//                {this.suit = "spades";
//                 this.value = index - 26;}
//            else if (index < 53)
//            {this.suit = "clubs";
//             this.value = index - 39;}
//            else
//            {System.out.println("Error, enter a number between 1-52!");}
    

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "The Card is: The " + value +" of " + suit +"s";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.suit);
        hash = 53 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.suit != other.suit) {
            return false;
        }
        return this.value == other.value;
    }


    
    
}
