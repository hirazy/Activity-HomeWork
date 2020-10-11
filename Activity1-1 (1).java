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
public class Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while(true){
            int y = sc.nextInt();
            if(y % 400 ==0 || (y % 100 !=0 && y % 4==0)){
                System.out.println("The year "+ y+" is leap year");
            }
            else{
                System.out.println("The year "+y + " is not leap year");
            }
        }
    }
    
}
