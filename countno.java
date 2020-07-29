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
public class countno {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
       System.out.println("Enter the limit"); 
        int n=obj.nextInt();
        int pos=0,neg=0,zero=0;
        for(int i=0;i<n;i++)
        {
             System.out.println("Enter the nos");
            int c=obj.nextInt(); 
            if(c>0)
                pos++;
            else if(c<0)
                neg++;
            else
                zero++;
        }
         System.out.println("Positives :"+pos+" Negatives :"+neg+" Zeros :"+zero);
     }
    
}
