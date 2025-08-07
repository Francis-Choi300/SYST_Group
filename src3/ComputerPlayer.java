package card1;

/**
 *
 * @author Stefan Jr
 */
public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
        this.playerHand = new CardHand(26);
    }

    @Override
    public void play() {
        System.out.println(name + " plays: " + playerHand.playCard());
    }
}
