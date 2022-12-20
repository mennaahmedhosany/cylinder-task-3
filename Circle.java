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
public class Circle {
       private double raduis ;
   private String color ;

    public Circle() {
    }

    public Circle(double raduis) {
        this.raduis = raduis;
    }
    public Circle(double raduis, String color) {
        this.raduis = raduis;
        this.color = color;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "raduis=" + raduis + ", color=" + color + '}';
    }
    public double getArea()
    {
        return 3.14*raduis*raduis;
    }
   
}
