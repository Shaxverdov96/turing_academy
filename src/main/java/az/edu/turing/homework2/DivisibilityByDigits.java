package az.edu.turing.homework2;

import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the four digit number");
        int num = scanner.nextInt();

        int digit1 = num % 10;
        int digit2 = (num / 10) % 10;
        int digit3 = (num / 100) % 10;
        int digit4 = (num / 1000) % 10;

        if (digit1 % digit2 == 0 && digit1 % digit3 == 0 && digit1 % digit4 == 0 ){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
