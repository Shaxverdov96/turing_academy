package az.edu.turing.lesson9;

import java.util.Scanner;

public class ArrayProqram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        //Ededleri arraye elave ediriy
        for (int i = 0; i < numbers.length; i++) {
            double num = scanner.nextDouble();
            numbers[i] = num;
        }
        //Arraydeki ededleri cap ediriy
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + " ");
          }


    }
}
