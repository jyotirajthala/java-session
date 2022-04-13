package day11;

import java.util.Scanner;

public class CalculationPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your English marks");
        int english = scanner.nextInt();

        System.out.println("Enter your Math marks");
        int math = scanner.nextInt();

        System.out.println("Enter your Computer Marks");
        int computer = scanner.nextInt();

        System.out.println("Enter your Science Marks");
        int science = scanner.nextInt();

        System.out.println("Enter your Nepali Marks");
        int nepali = scanner.nextInt();

        int total = english + math + computer + science + nepali;
        float percentage = total/5;

        System.out.println("Total percentage is "+ percentage);

    }
}
