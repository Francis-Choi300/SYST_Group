/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class WarGame extends Game {
    
    private String name = "War Game";
    private ArrayList<Player> playerList;
            
    public WarGame() {
        super("WarGame");
    }
           
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return playerList;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.playerList = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    @Override
    public void play(){
    }

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    @Override
    public void declareWinner(){
        
    }
    
    
}
