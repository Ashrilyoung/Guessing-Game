/*
 * Ash Young 16007873 21/09/2018
 * This class decides the winner of the game
 */
package guessing.game;

/**
 *
 * @author 16007873 21/09/2018
 * This class decides which player won based off comparing the random number to the player numbers
 * 
 */

public class Result {
    
            public static boolean Result(int x, int y){             //function to calculate the winner of the game
                boolean win = false;                                //set win to flase to begin with
                if (x == y){                                        //if the players number is equal to the random number
                    win = true;         //the player has won    
                    return win;         //return the boolean
                }
                else{                   //otherwise return false
                    win = false;
                    return win;
                }
       
            }
}
