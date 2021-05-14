package assignment.Day2;

import java.util.Scanner;

public class IfCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What operation would you like to operate?");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. MOD\n");
        System.out.println(">>");

        int input = scan.nextInt();

        if (input == 1) {
            System.out.println("Enter the First number to Add");
            int a = scan.nextInt();

            System.out.println("Enter the Second number to Add");
            int b = scan.nextInt();

            int c = a + b;
            System.out.println("The Sum of " + a + " and " + b + " is " + c);

        } else if (input == 2) {
            System.out.println("Enter the First number to Subtract");
            int a = scan.nextInt();

            System.out.println("Enter the Second number to Subtract");
            int b = scan.nextInt();

            int c = a - b;
            System.out.println("The Difference of " + a + " and " + b + " is " + c);

        } else if (input == 3) {
            System.out.println("Enter the First number to Multiply");
            int a = scan.nextInt();

            System.out.println("Enter the Second number to Multiply");
            int b = scan.nextInt();

            int c = a * b;
            System.out.println("The Product of " + a + " and " + b + " is " + c);

        } else if (input == 4) {
            System.out.println("Enter the First number to Divide");
            int a = scan.nextInt();

            System.out.println("Enter the Second number to Divide");
            int b = scan.nextInt();

            int c = a / b;
            System.out.println("The Division of " + a + " and " + b + " is " + c);

        } else if (input == 5) {
            System.out.println("Enter the Dividend for Modulus");
            int a = scan.nextInt();

            System.out.println("Enter the Divisor for Modulus");
            int b = scan.nextInt();

            int c = a % b;
            System.out.println("The Modulus of " + a + " and " + b + " is " + c);

        } else {
            System.out.println("Invalid Input");
        }
    }
}
