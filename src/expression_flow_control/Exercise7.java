package expression_flow_control;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter the second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter the third number:");
        int thirdNumber = scanner.nextInt();

        if(firstNumber>=secondNumber&&firstNumber>=thirdNumber){
            System.out.println(firstNumber + " is the largest number.");
        }
        else if(secondNumber>=firstNumber&&secondNumber>=thirdNumber){
            System.out.println(secondNumber + " is the largest number.");
        } else
            System.out.println(thirdNumber + " is the largest number.");

        scanner.close();
    }
}
