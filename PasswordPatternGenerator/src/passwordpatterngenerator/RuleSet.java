/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordpatterngenerator;

/**
 *
 * @author Rich The idea is to pass information about the password while/after
 * its generated and have this here ruleset class validate and verify potential passwords.
 */
public class RuleSet {

    boolean noRepeatLetters = true;
    boolean noCaps = false;
    boolean mustHaveNumbers = false;
    boolean mustHaveSymbols = false;

    public boolean validateNoRepeatLetters(Pattern pattern, Coordinates nextCoordinates) {
        if (noRepeatLetters) {
            
            String passwordInProgress = pattern.getString();
            
            char nextChar = Keyboard.characterFromCoordinates(nextCoordinates);
            
            if (passwordInProgress != null && passwordInProgress.length() > 0) {
                if (passwordInProgress.indexOf(nextChar) != -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
