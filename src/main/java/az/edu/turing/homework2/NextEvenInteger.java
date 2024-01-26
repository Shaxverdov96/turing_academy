package az.edu.turing.homework2;

import java.util.Scanner;

public class NextEvenInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + 2);
        } else System.out.println(num + 1);
    }
}
