package az.edu.homework2;

import java.util.Scanner;

public class OneDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scanner.nextInt();

        if (num >= -9 && num <= 9){
            System.out.println("OK");
        }else System.out.println("NO");
    }
}
