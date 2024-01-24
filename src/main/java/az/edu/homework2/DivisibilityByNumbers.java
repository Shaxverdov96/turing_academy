package az.edu.homework2;

import java.util.Scanner;

public class DivisibilityByNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int numN = scanner.nextInt();
        System.out.println("Write a number");
        int numA = scanner.nextInt();
        System.out.println("Write a number");
        int numB = scanner.nextInt();

        if (numN % numA == 0 && numN % numB == 0){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
