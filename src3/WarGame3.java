package card1;

/**
 *
 * @author Stefan Jr
 */
public class WarGame extends Game {
    
    public WarGame() {
      super("War Game");
    }
    
    @Override
    public void play() {
        System.out.println("Starting the War Game...");

        int rounds = players.get(0).getPlayerHand().getCards().size();

        for (int i = 0; i < rounds; i++) {
            Card card1 = players.get(0).getPlayerHand().playCard();
            Card card2 = players.get(1).getPlayerHand().playCard();

            System.out.println(players.get(0).getName() + " plays " + card1);
            System.out.println(players.get(1).getName() + " plays " + card2);

            if (card1.getIndex() > card2.getIndex()) {
                players.get(0).score++;
                System.out.println(players.get(0).getName() + " wins the round!");
            } else if (card2.getIndex() > card1.getIndex()) {
                players.get(1).score++;
                System.out.println(players.get(1).getName() + " wins the round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println();
        }

        declareWinner();
    }
    
}
