package az.edu.homework2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a four digit number");
        int num = scanner.nextInt();

        int firstnum = num / 1000;
        int lastnum = num % 10;

        System.out.println(firstnum+lastnum);
    }
}
