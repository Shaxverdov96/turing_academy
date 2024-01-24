package az.edu.homework2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number");
        int num = scanner.nextInt();

        if (num % 2 == 0 ){
            System.out.println("EVEN");
        }else System.out.println("ODD");
    }
}
