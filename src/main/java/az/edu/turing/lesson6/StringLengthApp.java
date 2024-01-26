package az.edu.turing.lesson6;

import java.util.Scanner;

public class StringLengthApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String a = input.nextLine();
        System.out.println(a.length() * 2);
    }

}
