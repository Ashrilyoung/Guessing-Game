/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.game;

/**
 *
 * @author 16007873
 */
public class Winner {
    
        public static int gamewinner(int x){
           
            switch (x){
            case 1:
                System.out.println("PLayer 1 wins!");
                break;
            case 2:
                System.out.println("PLayer 2 wins!");
                break;
            case 3:
                System.out.println("PLayer 3 wins!");
                break;
            default:
                System.out.println("You have all lost!");
                break;
        }
            return x;
                    
        }
}
