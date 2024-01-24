package az.edu.homework2;

import java.util.Scanner;

public class NoneOfTheTwoConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scanner.nextInt();

        if (num % 2 == 0 && num > 0 || num % 2 != 0 && num < 0) {
            System.out.println("No");
        } else System.out.println("Yes");
    }
}
