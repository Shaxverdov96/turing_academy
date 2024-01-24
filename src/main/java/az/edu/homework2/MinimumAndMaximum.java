package az.edu.homework2;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num1 = scanner.nextInt();
        System.out.println("Write a number");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
        } else if (num1 < num2) {
            System.out.println(num1 + " " + num2);
        } else System.out.println("=");

    }
}
