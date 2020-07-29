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
public class integertodigit {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int d,i=0;
        int a[]=new int[10];
        System.out.println("Enter an integer");
        int n=obj.nextInt();
        while(n>0)
        {
            d=n%10;
            a[i]=d;
            n=n/10;
            i++;
        }
        System.out.println("Splitted digits");
        for(int j=i-1;j>=0;j--)
            System.out.println(a[j]);
    }
    
    
}
