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
public class Fibonacci {
    
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
        int a=0;
        int b=1,c;
        System.out.println("enter the limit");
        int n=obj.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        
        }
        
    }
    
}
