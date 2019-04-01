/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordpatterngenerator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rich
 */
public class Pattern {          //The stored information about a single password "pattern"
    
    private List<Coordinates> pattern;  //zyx coordinates of the 3D array keyboard
    private String string;
    
    public Pattern() {
        this.pattern = new ArrayList<>();
        
        pattern.add(CoordinateTransformer.makeRandomCoordinates());
        
        
    }

    public List<Coordinates> getPattern() {
        return pattern;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    
    
}
