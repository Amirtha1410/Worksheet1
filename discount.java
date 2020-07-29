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
public class discount {
    
  public static void main(String[] args){
      
      Scanner obj=new Scanner(System.in);
      double A,D,O;
      System.out.println("Enter amount and percentage");
      A=obj.nextDouble();
      D=obj.nextDouble();
      O=(A*D)/100;
      System.out.println("Output:"+(A-O));
      
  }  
}
