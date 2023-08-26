package expression_flow_control;

import java.util.Scanner;

public class Exercise8 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number:");
            int firstNumber = scanner.nextInt();

            System.out.println("Please enter the second number:");
            int secondNumber = scanner.nextInt();

            System.out.println("Please enter the third number:");
            int thirdNumber = scanner.nextInt();

            if(firstNumber<=secondNumber&&firstNumber<=thirdNumber){
                System.out.println(firstNumber + " is the smaller number.");
            }
            else if(secondNumber<=firstNumber&&secondNumber<=thirdNumber){
                System.out.println(secondNumber + " is the smaller number.");
            } else
                System.out.println(thirdNumber + " is the smaller number.");
            scanner.close();
        }
    }


