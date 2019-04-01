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
public class Coordinates {
    
    private int z, y, x;
    //private Triplet<Integer, Integer, Integer> triplet;

    public Coordinates(int z, int y, int x) {
        this.z = z;
        this.y = y;
        this.x = x;
        
        //this.triplet = Triplet.of(z, y, x);
    }
    
    
    
    

//    public Coordinates(Triplet<Integer, Integer, Integer> triplet) {
//        this.triplet = triplet;
//        
//        this.z = triplet.first;
//        this.y = triplet.second;
//        this.x = triplet.third;
//    }

    public int getZ() {
        return z;
    }

    public void flipZ() {
        
        if(z == 0)
            this.z = 1;
        else if(z == 1)
            this.z = 0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

//    public Triplet<Integer, Integer, Integer> getTriplet() {
//        if(triplet != null)
//            return triplet;
//        else 
//            return Triplet.of(z, y, x);
//    }
//
//    public void setTriplet(Triplet<Integer, Integer, Integer> triplet) {
//        this.triplet = triplet;
//    }

    @Override
    public String toString() {
        return "z=" + z + ", y=" + y + ", x=" + x;
    }
    
    
    
    
}
