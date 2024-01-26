package az.edu.turing.homework2;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        double num1 = scanner.nextInt();
        System.out.println("Write a number");
        double num2 = scanner.nextInt();

        if (num1 % num2 == 0){
            System.out.println("Divisible");
        }else System.out.println(num1 / num2);
    }
}
