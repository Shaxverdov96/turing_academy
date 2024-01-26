package az.edu.turing.homework2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}
