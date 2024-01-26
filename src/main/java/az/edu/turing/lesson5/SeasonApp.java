package az.edu.turing.lesson5;

public class SeasonApp {
    public static void main(String[] args) {
        int n = 1;

        boolean isValidInput = n < 1 || n > 12;

        System.out.println(isValidInput);
    }
}
