package assignment_1;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choice = getChoice(scanner);

            if (choice == 9) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            performOperation(calculator, choice, scanner);
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Mean");
        System.out.println("8. Variance");
        System.out.println("9. Exit");
    }

    private static int getChoice(Scanner scanner) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 9) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
        return choice;
    }

    private static void performOperation(Calculator calculator, int choice, Scanner scanner) {
        double result;

        switch (choice) {
            case 1:
                System.out.println("Enter numbers to add. Enter 'end' to stop.");
                while (scanner.hasNextDouble()) {
                    calculator.addNumber(scanner.nextDouble());
                }
                result = calculator.add();
                break;
            case 2:
                System.out.println("Enter numbers to subtract. Enter 'end' to stop.");
                while (scanner.hasNextDouble()) {
                    calculator.addNumber(scanner.nextDouble());
                }
                result = calculator.subtract();
                break;
            case 3:
                System.out.println("Enter numbers to multiply. Enter 'end' to stop.");
                while (scanner.hasNextDouble()) {
                    calculator.addNumber(scanner.nextDouble());
                }
                result = calculator.multiply();
                break;
            case 4:
                System.out.println("Enter numbers to divide. Enter 'end' to stop.");
                while (scanner.hasNextDouble()) {
                    calculator.addNumber(scanner.nextDouble());
                }
                result = calculator.divide();
                break;
            case 5:
                System.out.print("Enter a number to find the square root: ");
                double numForSquareRoot = scanner.nextDouble();
                calculator.addNumber(numForSquareRoot);
                result = calculator.squareRoot();
                break;
            case 6:
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the exponent: ");
                double exponent = scanner.nextDouble();
                calculator.addNumber(base);
                calculator.addNumber(exponent);
                result = calculator.power();
                System.out.printf("Result: %.10f%n", result);
                break;

            case 7:
                System.out.println("Enter numbers to calculate mean. Enter 'end' to stop.");
                while (scanner.hasNextDouble()) {
                    calculator.addNumber(scanner.nextDouble());
                }
                result = calculator.mean();
                break;
            case 8:
                System.out.println("Enter numbers to calculate variance. Enter 'end' to stop.");
                while (scanner.hasNextDouble()) {
                    calculator.addNumber(scanner.nextDouble());
                }
                result = calculator.variance();
                break;
            default:
                result = 0.0;
        }

        System.out.println("Result: " + result);
        calculator = new Calculator(); 
    }
}
