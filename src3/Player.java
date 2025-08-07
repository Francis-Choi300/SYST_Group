package card1;

/**
 *
 * @author Stefan Jr
 */
public abstract class Player {
    protected String name;
    protected int score;
    protected CardHand playerHand;
    
    public Player(String name) {
       this.name = name;
       this.score = 0;
    }
    
    public abstract void play();
    
    public int getScore() {
      return score;
    }
    
    public String getName() {
      return name;
    }
    
    public CardHand getPlayerHand() {
       return playerHand;
    }
}
