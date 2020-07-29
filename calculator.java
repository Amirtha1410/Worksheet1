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
public class calculator {
     public static void main(String[] args){
         
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter 2 nos");
         int a=obj.nextInt();
         int b=obj.nextInt();
         System.out.println("Pass the condition");
         int c=obj.nextInt();
         switch(c)
         {
             case 1:System.out.println("Addition:"+(a+b));
             break;
             case 2:System.out.println("Subtraction:"+(a-b));
             break;
             case 3:System.out.println("Multiplication:"+(a*b));
             break;
             case 4:System.out.println("Division:"+(a/b));
             break;
             default:
                 System.out.println("Incorrect option");
         }
             
     }
    
}
