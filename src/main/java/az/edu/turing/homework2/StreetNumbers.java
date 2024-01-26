package az.edu.turing.homework2;

import java.util.Scanner;

public class StreetNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of the first house");
        int housenum1 = scanner.nextInt();
        System.out.println("Write the number of the second house");
        int housenum2 = scanner.nextInt();

        if (housenum1 % 2 == 0 && housenum2 % 2 == 0){
            System.out.println("0");
        }else System.out.println("1");
    }
}
