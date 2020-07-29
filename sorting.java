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
public class sorting {
     public static void main(String[] args){
          Scanner obj=new Scanner(System.in);
         int a[]=new int[10];
         int i,j,temp;
          System.out.println("Enter the limit:");
          int n=obj.nextInt();
          System.out.println("Enter "+n+" elements:");
          for( i=0;i<n;i++)
          {
              a[i]=obj.nextInt();
              
          }
          for( i=0;i<n;i++)
          {
          for(j=i+1;j<n;j++)
          {
              if(a[i]>a[j])
              {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
          
     }
         System.out.println("Sorted  elements:"); 
         for( i=0;i<n;i++)
         {
             System.out.println(a[i]);
         }
     }
}
