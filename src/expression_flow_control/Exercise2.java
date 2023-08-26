package expression_flow_control;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i <= 2; i++) {
            System.out.println("please enter a number");
            int number = scanner.nextInt();
            sum = sum + number;

        }
        scanner.close();
        System.out.println("Sum of the entered numbers: " + sum);
    }
}
