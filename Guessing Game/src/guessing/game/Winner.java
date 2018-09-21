/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.game;

/**
 *
 * @author 16007873 21/09/2018
 * This class declares a winner based off the winnerno
 * 
 */
public class Winner {
    
        public static boolean Winner(boolean b, int x){   //pass the winnerno to this class 
            
            if (b == true){
                System.out.println("Player "+x+" wins!"); 
                return b;
            }
            else{
                System.out.println("Player "+x+" loses!"); 
                return b;
            }
                    
        }
}
