/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.game;

import java.util.Scanner;

/**
 *
 * @author 16007873  21/09/2018
 * This is the start class where most of the important functions of the program are called from
 */
public class GuessGame {
    
    
    public void startGame(){
    
        int pno1=0;                 //the number player 1 guesses will be stored here
        int pno2=0;                 //the number player 2 guesses will be stored here
        int pno3=0;                 //the number player 3 guesses will be stored here
        int random = 0;             //the random number will be stored here
        int playerguess=0;          //the current guess from a player will be stored here
        int winnerno = 0;           //the player number of the winner will be stored here
        
        random = (int)(Math.random()*9) + 1;        //generate random number between 1 and 10
        Scanner kboard = new Scanner(System.in);    //scanner to watch for keyboard inputs
        System.out.println("Player 1 Please Guess.");   //print message for player
//        System.out.println(random);                     //print random number for testing
        
        while(pno1==0&&pno2==0&&pno3==0){
            playerguess = Integer.parseInt(kboard.nextLine()); //this sets the playerguess variable to the next integer inputted through the keyboard. This is inspired by code shared by a user here "https://stackoverflow.com/questions/17538182/getting-keyboard-input"
            pno1 = playerguess;                                 //set player number 1 to the players guess
            System.out.println("Player 2 Please Guess.");           //print message for player
            playerguess = Integer.parseInt(kboard.nextLine());      //set player guess to the next integer entered by the keyboard
            pno2 = playerguess;                                 //set player number 2 to the players guess
            System.out.println("Player 3 Please Guess.");       //print a message for the player
            playerguess = Integer.parseInt(kboard.nextLine());    //set player guess to the next integer entered by the keyboard
            pno3 = playerguess;                                 //set player number 3 to the players guess
        }
        
        winnerno = Result.calcResult(pno1, pno2, pno3, random);         //pass the players chosen numbers and the random numbers to a class to find a winner 
        
        Winner.gamewinner(winnerno);                                    //pass the winner number to a class to declare the winner
        
//        switch (winnerno) {
//            case 1:
//                System.out.println("PLayer 1 wins!");
//                break;
//            case 2:
//                System.out.println("PLayer 2 wins!");
//                break;
//            case 3:
//                System.out.println("PLayer 3 wins!");
//                break;
//            default:
//                System.out.println("You have all lost!");
//                break;
//        }
    }
    
//        public static int calcResult(int x, int y,int a, int b){             //function to calculate total of 2 passed ints
//            int winnerno = 0;
//            if(x ==  b){
//                winnerno = 1;
//            }
//            else if(y ==  b){
//                winnerno = 2;
//            }
//            else if(a ==  b){
//                winnerno = 3;
//            }
//            else{
//                winnerno = 4;
//            }
//            System.out.println(winnerno);
//            return winnerno;
//        }
}
