package az.edu.homework2;

import java.util.Scanner;

public class OutsideTheInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int numA = scanner.nextInt();
        System.out.println("Write a number");
        int numX = scanner.nextInt();
        System.out.println("Write a number");
        int numB = scanner.nextInt();

        if (numX < numA && numX > numB){
            System.out.println("OUT");
        }else System.out.println("IN");
    }
}
