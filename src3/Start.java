package card1;

import java.util.ArrayList;

/**
 *
 * @author Stefan Jr
 */
public class Start {
    public static void main(String[] args){
       WarGame game = new WarGame();
       ArrayList<Player> playerList = new ArrayList<>();
       playerList.add(new UserPlayer("John"));
       playerList.add(new UserPlayer("Bob"));
       
       game.setPlayers(playerList);
       game.play();
       
    }
}
