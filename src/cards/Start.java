/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cards;

/**
 *
 * @author User
 */
public class Start {
    public static void main(String[] args){
        User player1 = new User();
        
        player1.startingHand(7);
        player1.displayHand();
        System.out.println("Game Complete");
    }
}
