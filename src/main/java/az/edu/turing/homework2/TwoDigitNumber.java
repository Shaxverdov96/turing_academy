package az.edu.turing.homework2;

import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scanner.nextInt();

        if (num > 9 && num <= 99){
            System.out.println("Ok");
        }else if(num < -9 && num >= -99){
            System.out.println("Ok");
        }else System.out.println("No");
    }
}
