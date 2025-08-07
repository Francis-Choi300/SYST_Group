package card1;

/**
 *
 * @author Stefan Jr
 */


import java.util.*;


public class Game {
    protected String name;
    protected ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void play() {
        // Default implementation
    }

    public void declareWinner() {
        Player winner = players.get(0);
        for (Player p : players) {
            if (p.getScore() > winner.getScore()) {
                winner = p;
            }
        }
        System.out.println("Winner: " + winner.getName() + " with score: " + winner.getScore());
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
