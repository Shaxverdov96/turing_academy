package org.Leesson1;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("eded yazin");

        double bal = scan.nextDouble();
         if(bal >= 90 && bal <=100){
             System.out.println("A");
        }else if(bal > 80 && bal <90){
            System.out.println("B");
        }else if(bal > 70 && bal <80){
             System.out.println("C");
         }else if(bal > 60 && bal < 70){
             System.out.println("D");
         }else if(bal > 50 && bal <60){
             System.out.println("E");
         }else if(bal > 40 && bal < 50){
             System.out.println("F");
         }else System.out.println("");
    }
}
