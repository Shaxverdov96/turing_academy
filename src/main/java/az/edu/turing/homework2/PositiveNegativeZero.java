package az.edu.turing.homework2;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the weather today");
        int weather = scanner.nextInt();

        if (weather > 0){
            System.out.println("Positive");
        } else if (weather < 0) {
            System.out.println("Negative");
        }else System.out.println("0");
    }
}
