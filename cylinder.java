/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author ORIGINAL
 */
public class cylinder extends Circle {
    private double height ;

    public cylinder() {
    }

    public cylinder(double height, double raduis) {
        super(raduis);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "cylinder{" + "height=" + height + '}';
    }
 public double get_volume()
 {
        return getArea()*height;
     
 }
 
    
}
