/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.game;

import java.util.Scanner;

/**
 *
 * @author 16007873
 */
public class GuessGame {
    
    
    public void startGame(){
    
        int pno1=0;
        int pno2=0;
        int pno3=0;
        int random = 0;
        int playerguess=0;
        int winnerno = 0;
        
        random = (int)(Math.random()*9) + 1;        //generate random number between 1 and 10
        Scanner kboard = new Scanner(System.in);
        System.out.println("Player 1 Please Guess.");
        System.out.println(random);
        
        while(pno1==0&&pno2==0&&pno3==0){
            playerguess = Integer.parseInt(kboard.nextLine());
            pno1 = playerguess;
            System.out.println("Player 2 Please Guess.");
            playerguess = Integer.parseInt(kboard.nextLine());
            pno2 = playerguess;
            System.out.println("Player 3 Please Guess.");
            playerguess = Integer.parseInt(kboard.nextLine());
            pno3 = playerguess;
        }
        
        winnerno = calcResult(pno1, pno2, pno3, random);
        
        if (winnerno == 1){
            System.out.println("PLayer 1 wins!");
        }
        else if(winnerno == 2){
            System.out.println("PLayer 2 wins!");
        }
        else if(winnerno == 3){
            System.out.println("PLayer 3 wins!");
        }
        else{
            System.out.println("You have all lost!");
        }
    }
    
        public static int calcResult(int x, int y,int a, int b){             //function to calculate total of 2 passed ints
            int winnerno = 0;
            
            if(x ==  b){
                winnerno = 1;
            }
            else if(y ==  b){
                winnerno = 2;
            }
            else if(a ==  b){
                winnerno = 3;
            }
            else{
                winnerno = 4;
            }
            System.out.println(winnerno);
            return winnerno;
        }
}
