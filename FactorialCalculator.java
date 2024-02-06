package assignment_1;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        displayMenu();

        int option;
        try {
            option = Integer.parseInt(getInput("Enter the choice: "));
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice.");
            return;
        }

        switch (option) {
            case 1:
                commandLineArgsMethod(args);
                break;
            case 2:
                scannerMethod();
                break;
            case 3:
                bufferedReaderMethod();
                break;
            case 4:
                dataInputStreamMethod();
                break;
            case 5:
                System.out.println("Console is not available");
                scannerMethod();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void displayMenu() {
        System.out.println("Choose an input method:");
        System.out.println("1. Command Line Arguments");
        System.out.println("2. Scanner");
        System.out.println("3. BufferedReader");
        System.out.println("4. DataInputStream");
        System.out.println("5. Console");
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void commandLineArgsMethod(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        calculateAndPrintFactorial(number);
    }

    private static void scannerMethod() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            calculateAndPrintFactorial(number);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    private static void bufferedReaderMethod() {
        String input = getInput("Enter a number: ");
        try {
            int number = Integer.parseInt(input);
            calculateAndPrintFactorial(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    private static void dataInputStreamMethod() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            calculateAndPrintFactorial(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    private static void calculateAndPrintFactorial(int number) {
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

