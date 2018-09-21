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
                boolean win = false;
                if (x == y){
                    win = true;
                    return win; 
                }
                else{
                    win = false;
                    return win;
                }
                
                             //return the winnerno
       
            }
}
