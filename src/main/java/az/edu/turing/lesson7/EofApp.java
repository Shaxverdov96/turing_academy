package az.edu.turing.lesson7;

import java.util.Scanner;

public class EofApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long sum = 0;
        while (scan.hasNextInt()) {
            sum += scan.nextInt();
        }

        System.out.println(sum);
    }

}