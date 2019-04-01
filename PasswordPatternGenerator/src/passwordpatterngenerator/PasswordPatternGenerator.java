/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordpatterngenerator;

/**
 *
 * @author Rich
 */
public class PasswordPatternGenerator {
    
    /*
    Notes:
        This application is designed to create passwords based on patterns on the keyboard, mainly because I find it a useful way of remembering complex passwords.
    
        A lot of stuff in this main class is just for testing and will be moved in later commits
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Keyboard k = new Keyboard();
        k.printKeyboard();
        
        Pattern p = new Pattern();
        RuleSet r = new RuleSet();
        
        int numChars = 0;
        
        for(int i = 0; i < 100; i++){
            Coordinates nextCoordinates = CoordinateTransformer.transformCoordinates(p.getPattern().get(numChars));
            if(k.areCoordinatesValid(nextCoordinates)){
                char nextChar = k.characterFromCoordinates(nextCoordinates);
                if(r.validateNoRepeatLetters(p, nextChar)){
                    p.getPattern().add(nextCoordinates);
                    p.setString(k.stringFromPattern(p));
                    numChars = p.getString().length()-1;
                }
            }
            
            if(numChars > 7)
                break;
        }
        
        String password = k.stringFromPattern(p);
        
        System.out.println(password);
    }
    
}
