package expression_flow_control;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float ave =0;

        for (float i = 1; i <= 3; i++) {
            System.out.println("please enter a number");
            float number = scanner.nextFloat();
            sum = sum + number;
            ave = sum/i;

        }
        scanner.close();
        System.out.println("Average of the entered numbers: " + ave);
    }
}
