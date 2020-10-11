/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Activity2 {
    public static void main(String[] args) {
        double a,  b  , c , x1, x2;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("-----^^--------------------Welcome to my program------------^^--------");
        
        System.out.println("Vui long nhap a: ");
        a = sc.nextDouble();
        System.out.println("vui long nhap b: ");
        b = sc.nextDouble();
        System.out.println("Vui long nhap c: ");
        c = sc.nextDouble();
        
        if( a == 0 && b==0 && c==0){
            System.out.println("Nothing to solve");
        }
        else if(a == 0 && b == 0 && c!=0){
            System.out.println("The equation has no root");
        }
        else if(a==0){
            x1 = -c/b;
            System.out.println("Equation has only x: "+x1);
        }
        else{
            double delta = b*b -  4*a*c;
            if(delta < 0){
                System.out.println("the equation has no real root");
            }
            else if(delta == 0){
                System.out.println("the equation has only x: "+(-b/(2*a)));
            }
            else{
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("First x1: "+x1);
                System.out.println("Second x2: "+x2);
            }
        }
    }
}
