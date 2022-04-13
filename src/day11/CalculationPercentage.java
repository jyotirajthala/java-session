package day11;

import java.util.Scanner;

public class CalculationPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user name");
        String userName = scanner.nextLine();

        System.out.println("Enter your Password");
        String password = scanner.nextLine();

        if(!password.equals("admin123")){
            System.out.println("You are not authenticated user. Please try again");
            System.exit(0);
        }

        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Enter your English marks");
        float english = scanner.nextFloat();

        System.out.println("Enter your Math marks");
        float math = scanner.nextFloat();

        System.out.println("Enter your Computer Marks");
        float computer = scanner.nextFloat();

        System.out.println("Enter your Science Marks");
        float science = scanner.nextFloat();

        System.out.println("Enter your Nepali Marks");
        float nepali = scanner.nextFloat();

        float total = english + math + computer + science + nepali;
        float percentage = total/5;

        System.out.println("Hello, "+ userName);
        System.out.println("Your Total percentage is "+ percentage);

    }
}
