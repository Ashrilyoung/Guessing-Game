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
    

        int random = 0;             //the random number will be stored here
        boolean win = false;
        int playernumber = 1;
        int chosennumber = 0;
        
        
        random = (int)(Math.random()*9) + 1;        //generate random number between 1 and 10
        Scanner kboard = new Scanner(System.in);    //scanner to watch for keyboard inputs
//        System.out.println(random);                     //print random number for testing
        
        while(playernumber < 4){                       //while all players have not chosen a number
            System.out.println("Player "+playernumber+" Please Guess.");   //print message for player
            chosennumber = Integer.parseInt(kboard.nextLine()); //this sets the playerguess variable to the next integer inputted through the keyboard. This is inspired by code shared by a user here "https://stackoverflow.com/questions/17538182/getting-keyboard-input"
            win = Result.Result(chosennumber,random);
            Winner.Winner(win, playernumber);
            playernumber = playernumber + 1;
        }   
        
        
}}
