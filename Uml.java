/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class Uml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle val1=new Circle();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the raduis");
        double raduis=input.nextDouble();
        val1.setRaduis(raduis);
        System.out.println("the area of circle\n" +val1.getArea());
        System.out.println("please enter the height");
        double height =input.nextDouble();
        cylinder val2 =new cylinder(raduis,height);
        System.out.println("the volume of cylinder\n" +val2.get_volume());
    }
    
}
