package expression_flow_control;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to check out?");
        Scanner scanner = new Scanner(System.in);
        String latter = scanner.nextLine();
        if(latter.contains("N")){
            System.out.println("It's good that you decided to stay");
        }
        else if(latter.contains("Y")){
            System.out.println("Thank you and goodbye");
        } else
            System.out.println("Not supported, thanks and bye");

        scanner.close();

        }
    }

