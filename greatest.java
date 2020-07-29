/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class greatest {
    
    
    public static void main(String[] args){
      
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 3 nos");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b && a>c)
            System.out.println("A is greater");
        else if(b>a && b>c)
            System.out.println("B is greater");
        else
            System.out.println("C is greater");
          
    }   
}
