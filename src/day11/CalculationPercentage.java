package day11;

import java.util.Scanner;

public class CalculationPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Total percentage is "+ percentage);

    }
}
