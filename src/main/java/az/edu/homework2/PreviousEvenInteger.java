package az.edu.homework2;

import java.util.Scanner;

public class PreviousEvenInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num - 2);
        } else System.out.println(num - 1);
    }
}
