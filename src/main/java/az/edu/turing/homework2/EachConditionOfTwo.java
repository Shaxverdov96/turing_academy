package az.edu.turing.homework2;

import java.util.Scanner;

public class EachConditionOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 2 == 0 && num > 9) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
