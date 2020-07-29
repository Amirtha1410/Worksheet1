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
public class reverse {
      public static void main(String[] args){
         
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit:");
         int n=obj.nextInt();
         int a[]=new int[10];
         System.out.println("Enter the elements of array:");
         for( int i=0;i<n;i++)
         {
             a[i]=obj.nextInt();
             
         }
         System.out.println("Rversed array:");
          for( int i=n-1;i>=0;i--)
          {
              System.out.println(a[i]);
              
          }
      }
}
