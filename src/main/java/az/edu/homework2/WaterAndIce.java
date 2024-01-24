package az.edu.homework2;

import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the weather?");
        int t = scanner.nextInt();

        if (t > 0){
            System.out.println("Water");
        }else System.out.println("Ice");
    }
}
