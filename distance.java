/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

/**
 *
 * @author ELCOT
 */
public class distance {
    
    public static void main(String[] args){
        int x1=2;
        int x2=4;
        int y1=6;
        int y2=8;
        System.out.println("The points are");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(y1);
        System.out.println(y2);
        double D=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance:"+D);
    }
    
}
