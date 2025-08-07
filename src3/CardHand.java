package card1;

/**
 *
 * @author Stefan Jr
 */


import java.util.*;



public class CardHand {
    private final int size;
    private ArrayList<Card> cards;
    private final CardGenerator dealer;

    public CardHand(int size) {
        this.size = size;
        this.cards = new ArrayList<>();
        this.dealer = new CardGenerator();
        setCards();
    }

    public void setCards() {
        this.cards = dealer.deal(size);
    }

    public Card playCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    
}
