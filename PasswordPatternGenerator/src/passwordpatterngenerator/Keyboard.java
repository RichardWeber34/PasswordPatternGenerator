/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordpatterngenerator;

import java.util.List;

/**
 *
 * @author Rich
 * This class is the abstracted keyboard represented by a 3D char array. The dimensions are:
 * the two dimensions of the keyboard, x and y, and a third dimension z for shifted characters i.e caps and symbols
 */
public class Keyboard {
    
    
    char[][][] keyboard = /*new char[2][4][13]*/ {
        {                 /*        [z][y][x] */
            {            
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '#'
            },
            {
                'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']', '`'
            },
            {
                '`', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', '\'', '`'
            },
            {
                '`', '\\', 'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/', '`'
            }
        },
        {
            {
                '!', '"', '£', '$', '%', '^', '&', '*', '(', ')', '_', '+', '~'
            },
            {
                'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '{', '}', '`'
            },
            {
                '`', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '@', '`'
            },
            {
                '`', '|', 'Z', 'X' , 'C', 'V', 'B', 'N', 'M', '<', '>', '?', '`'
            }
        }
    };
    
    public String stringFromPattern(Pattern input){
        List<Coordinates> pattern = input.getPattern();
        char[] chars = new char[pattern.size()];
        
        for(int i=0; i<chars.length; i++){
           chars[i] = characterFromCoordinates(pattern.get(i));
        }
        
        return new String(chars);
    }
    
    public char characterFromCoordinates(Coordinates input){
        return keyboard[input.getZ()][input.getY()][input.getX()];
    }
    
    public Coordinates coordinatesFromCharacter(char letter){
        int z,y,x;
        
        char workingChar;        
        for (z = 0; keyboard.length-1 >= z; z++){
            for(y = 0; keyboard[0].length-1 >= y; y++){
                for(x = 0; keyboard[0][0].length-1 >= x; x++){
                    workingChar = keyboard[z][y][x];
                    if(letter == workingChar){
                        return new Coordinates(z,y,x);
                    }
                }
            }
        }   
        return null;
    }
    
    public boolean areCoordinatesValid(Coordinates coordinates){
        
        try{
            char c = characterFromCoordinates(coordinates);
            if(c == '`'){
                return false;
            }
        } catch (Exception e){
            System.out.println("Invalid Coorindates");
            return false;
        } 
           
        return true;
    }
    
    public void printKeyboard(){
                
        String workingString = "";
        for (int z = 0; keyboard.length-1 >= z; z++){
            System.out.println("Keyboard " + (z+1) + "\n");
            for(int y = 0; keyboard[0].length-1 >= y; y++){
                for(int x = 0; keyboard[0][0].length-1 >= x; x++){
                    workingString += keyboard[z][y][x] + " ";
                }
                System.out.println(workingString);
                workingString = ""; 
            }
            System.out.println("\n");
        }   
    }
     
}
