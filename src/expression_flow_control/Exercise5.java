package expression_flow_control;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName = scanner.nextLine();
        if (firstName.startsWith("M")){
            System.out.println("The name start with the latter M ");
        }else{
            System.out.println("The name not start with the latter M ");

        }

        scanner.close();
    }
}
