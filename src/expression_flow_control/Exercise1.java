package expression_flow_control;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("please enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("please enter your age");
        float age = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("please enter your city");
        String city = scanner.nextLine();

        System.out.println("My name is " + firstName + " "+ lastName + " I'm "+ age+  " years old and I live in "+city );
        scanner.close();
    }
}
