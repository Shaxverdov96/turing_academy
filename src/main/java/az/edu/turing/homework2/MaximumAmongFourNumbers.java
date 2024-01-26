package az.edu.turing.homework2;

import java.util.Scanner;

public class MaximumAmongFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number not greater than 1000");
        int numA = scanner.nextInt();
        System.out.println("Write a number not greater than 1000");
        int numB = scanner.nextInt();
        System.out.println("Write a number not greater than 1000");
        int numC = scanner.nextInt();
        System.out.println("Write a number not greater than 1000");
        int numD = scanner.nextInt();

        int max = numA;

        if (max < numB) {
            max = numB;
        } else if (max < numC) {
            max = numC;
        } else if (max < numD) {
            max = numD;
        }
        System.out.println(max);

    }
}
