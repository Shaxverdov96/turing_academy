package org.Leesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("regem yaz");
        double a = scan.nextDouble();
        System.out.println("regem yaz");
        double b = scan.nextDouble();

        double c = a % b;
        System.out.println(c);

        scan.close();

    }
}
