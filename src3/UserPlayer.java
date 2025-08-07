package card1;

/**
 *
 * @author Stefan Jr
 */
public class UserPlayer extends Player {
    public UserPlayer(String name) {
        super(name);
        this.playerHand = new CardHand(26); 
    }

    @Override
    public void play() {
        System.out.println(name + " plays: " + playerHand.playCard());
    }
}
