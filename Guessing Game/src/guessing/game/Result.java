/*
 * Ash Young 16007873 21/09/2018
 * This class decides the winner of the game
 */
package guessing.game;

/**
 *
 * @author 16007873
 */

public class Result {
    
            public static int calcResult(int x, int y,int a, int b){             //function to calculate the winner of the game
            int winnerno = 0;               //int to store a number based off the correct if statement
            if(x == b){                    //if player1 has the right answer
                winnerno = 1;              //winner number is equal to player number 1
            }
            else if(y == b){               //if player2 has the right answer
                winnerno = 2;              //winner number is equal to player number 1
            }
            else if(a == b){                //if player3 has the right answer
                winnerno = 3;               //winner number is equal to player number 1
            }
            else{                           //if no player has the right answer
                winnerno = 4;               //winner number is equal to player number 1
            }
            System.out.println(winnerno);
            return winnerno;               //return the winnerno
        }
}
