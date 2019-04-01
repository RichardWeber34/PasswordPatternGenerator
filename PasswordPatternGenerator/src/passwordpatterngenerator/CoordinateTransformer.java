/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordpatterngenerator;

import java.util.Random;


/**
 *
 * @author Rich
 */
public class CoordinateTransformer {
    
    static Random r = new Random();
    
    public static Coordinates makeRandomCoordinates(){
        Random r = new Random();
        
        int randZ = r.nextInt(2);
        int randY = r.nextInt(4);
        int randX = r.nextInt(13);
        
        return new Coordinates(randZ, randY, randX);
    }
    
    public static Coordinates transformCoordinates(Coordinates input){
              
        Integer z = input.getZ(), y = input.getY(), x = input.getX();
        
        int genValue = r.nextInt(4);
               
        switch(genValue){
            case 0:
                y++;
                System.out.println("y++");
                break;
            case 1:
                x++;
                System.out.println("x++");
                break;
            case 2:
                y--;
                System.out.println("y--");
                break;
            case 3: 
                x--;
                System.out.println("x--");
                break;
            default:
                break;
        }
        Coordinates transformedCoordinates = new Coordinates(z,y,x);
        genValue = r.nextInt(10);
        
        if(genValue <= Constants.shiftProbability){
            transformedCoordinates.flipZ();
            System.out.println("Shift flip");
        }
        
        return transformedCoordinates;
    }
 
}
