package day12;

import java.io.Console;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Console cons = System.console();

        System.out.println("Enter your user name");
        String userName = scanner.nextLine();

        /*
        System.out.println("Enter your Password");
        char[] passwordArray = cons.readPassword();

       String password = String.valueOf(passwordArray);

        if(!password.equals("admin123")){
            System.out.println("You are not authenticated user. Please try again");
            System.exit(0);
        }
         */

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
