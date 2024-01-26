package az.edu.turing.homework2;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a three digit number");
        int num = scanner.nextInt();

        int firstnum = num / 100;
        int middlenum = (num / 10) % 10;
        int lastnum = num % 10;

        System.out.println(firstnum * lastnum * middlenum);

    }
}
