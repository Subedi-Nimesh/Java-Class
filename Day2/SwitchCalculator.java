package assignment.Day2;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What operation would you like to operate?");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. MOD\n");
        System.out.println(">>");

        int input = scnr.nextInt();
        int a;
        int b;
        int c;

        switch (input) {
            case 1:
                System.out.println("Enter the First number to Add");
                a = scnr.nextInt();

                System.out.println("Enter the Second number to Add");
                b = scnr.nextInt();

                c = a + b;
                System.out.println("The Sum of " + a + " and " + b + " is " + c);
                break;

            case 2:
                System.out.println("Enter the First number to Subtract");
                a = scnr.nextInt();

                System.out.println("Enter the Second number to Subtract");
                b = scnr.nextInt();

                c = a - b;
                System.out.println("The Difference of " + a + " and " + b + " is " + c);
                break;

            case 3:
                System.out.println("Enter the First number to Multiply");
                a = scnr.nextInt();

                System.out.println("Enter the Second number to Multiply");
                b = scnr.nextInt();

                c = a * b;
                System.out.println("The Product of " + a + " and " + b + " is " + c);
                break;

            case 4:
                System.out.println("Enter the First number to Divide");
                a = scnr.nextInt();

                System.out.println("Enter the Second number to Divide");
                b = scnr.nextInt();

                c = a / b;
                System.out.println("The Division of " + a + " and " + b + " is " + c);
                break;

            case 5:
                System.out.println("Enter the Dividend for Modulus");
                a = scnr.nextInt();

                System.out.println("Enter the Divisor for Modulus");
                b = scnr.nextInt();

                c = a % b;
                System.out.println("The Modulus of " + a + " and " + b + " is " + c);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
