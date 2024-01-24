package az.edu.homework2;

import java.util.Scanner;

public class NumbersOfTheSameSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int num1 = scanner.nextInt();
        System.out.println("Write a number");
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0 )
            System.out.println("1");
       else if (num1 < 0 && num2 < 0){
            System.out.println("1");
        }else System.out.println("0");
    }
}
