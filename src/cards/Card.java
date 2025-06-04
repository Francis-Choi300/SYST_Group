/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cards;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Card {
    private String suit;
    private int value;
    private int index;
    
    //Constructor (suit and value)
    public Card(int suit, int value){
        switch (suit) {
            case 0:
                this.suit="hearts";
                break;
            case 1:
                this.suit="diamonds";
                break;
            case 2:
                this.suit="spades";
                break;
            case 3:
                this.suit="clubs";
                break;
            default:
                System.out.println("Error, invalid suit entered");
                break;
        }
        
        if (value > 0 && value < 14){this.value = value;}
        else {System.out.println("Error, number must be between 1-13");}
    }
    
    //Constructor index
    public Card(int index){
        this.index = index;
    
        if (index >0){
            if (index < 14)
                {this.suit = "hearts";
                 this.value = index;}
            else if (index < 27 )
                {this.suit = "diamonds";
                this.value = index - 13;}
            else if (index < 40)
                {this.suit = "spades";
                 this.value = index - 26;}
            else if (index < 53)
            {this.suit = "clubs";
             this.value = index - 39;}
            else
            {System.out.println("Error, enter a number between 1-52!");}
    }
    public int getIndex() {
        return index;
    }
    
    public void setIndex(int index) {    
        this.index = index;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", value=" + value + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.suit);
        hash = 53 * hash + this.value;
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
        
        //if (other.suit == (Card)obj.suit && other.value == (Card)obj.value)
        return true;
    }
    
    
}
