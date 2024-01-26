package az.edu.turing.homework2;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a three digit number");
        int num = scanner.nextInt();

        int firstnum = num / 100;
        int lastnum = num % 10;


        if (firstnum > lastnum) {
            System.out.println(firstnum);
        } else if (firstnum < lastnum) {
            System.out.println(lastnum);
        } else System.out.println("=");

    }
}
