package expression_flow_control;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age");
        float age = scanner.nextFloat();

        if(age>=18){
            System.out.println(age + " is above then 18");

        }else
            System.out.println(age + " is less then 18");
        scanner.close();
    }
}
