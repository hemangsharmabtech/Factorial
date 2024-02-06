Calculator Class:

Fields:
numbers: An ArrayList used to store the numbers provided by the user for various calculations.
Methods:
public Calculator(): Constructor for the Calculator class, initializing the numbers list.

public void addNumber(double number): Adds a number to the numbers list.

public double add(): Calculates the sum of all numbers in the numbers list.

public double subtract(): Calculates the result of subtracting the second number from the first in the numbers list.

public double multiply(): Calculates the product of all numbers in the numbers list.

public double divide(): Calculates the result of dividing the first number by the second in the numbers list.

public double squareRoot(): Calculates the square root of the first number in the numbers list.

public double power(): Calculates the result of raising the base to the power of the exponent in the numbers list.

public double mean(): Calculates the mean (average) of all numbers in the numbers list.

public double variance(): Calculates the variance of the numbers in the numbers list.




Calculator Class:
Methods:
public static void main(String[] args): The main entry point of the program, where the calculator is instantiated, and the user is prompted for menu choices.

private static void displayMenu(): Displays the calculator menu options.

private static int getChoice(Scanner scanner): Prompts the user for a menu choice and returns the selected option.

private static void performOperation(Calculator calculator, int choice, Scanner scanner): Performs the selected operation based on the user's choice.




Important Concepts:
Menu-Driven Approach: The program allows users to choose operations from a menu, providing an interactive and user-friendly interface.

Encapsulation: The Calculator class encapsulates the logic for various mathematical operations, providing a clean separation of concerns.

ArrayList: The use of ArrayList allows dynamic storage of user-provided numbers for calculations.

Error Handling: The code includes error handling for invalid input, ensuring a robust and user-friendly application.

Console Input: The Scanner class is used for reading user input from the console, enabling interaction with the program.

Formatting Output: The printf method is used for formatting the output of the power operation to display a specified number of decimal places.
