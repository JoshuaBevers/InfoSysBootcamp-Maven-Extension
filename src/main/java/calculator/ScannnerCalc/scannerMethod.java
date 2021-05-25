package calculator.ScannnerCalc;

import java.util.Scanner;

public class scannerMethod {

    public static Scanner userInput = new Scanner(System.in);

    public static void Scanners() {
        boolean running = true;
        while (running) {
            try {
                String userInput = getUserInput();
                switch (userInput) {
                    case "add":
                        running = handleAdd();
                        break;
                    default:
                        System.out.println("Sorry, what you entered was not recognized.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            } finally {
                closeResources();
            }
        }
        closeResources();
    }

    private static String getUserInput() {
        System.out.println("Please type a mode below");
        System.out.println("add: adds two numbers together");
        System.out.println("subtract: subtracts two numbers together");
        System.out.println("multiply: multiplies two numbers together");
        System.out.println("divide: divides two numbers together");
        System.out.println("exit: exists the program.");
        String parseInput = userInput.nextLine();
        System.out.println(parseInput);
        return parseInput;
    }


    private static boolean handleAdd() {
        System.out.println("Hello from add!");
        System.out.println("Please enter the first number!");
        return false;
    }

    private static void handleMultiply() {
        System.out.println("Hello from multiply!");
        System.out.println("Please enter the first number!");
        Scanner userNumber1 = new Scanner(System.in);
        double num1 = userNumber1.nextDouble();
        System.out.println("Please enter the second number!");
        Scanner userNumber2 = new Scanner(System.in);
        double num2 = userNumber2.nextDouble();
        double result = multiply(num1, num2);
        System.out.println("Your total is: " + result);
        userNumber1.close();
        userNumber2.close();
    }

    private static void handleDivide() {
        System.out.println("Hello from divide!");
        System.out.println("Please enter the first number!");
        Scanner userNumber1 = new Scanner(System.in);
        double num1 = userNumber1.nextDouble();
        System.out.println("Please enter the second number!");
        Scanner userNumber2 = new Scanner(System.in);
        double num2 = userNumber2.nextDouble();
        double result = divide(num1, num2);
        System.out.println("Your total is: " + result);
        userNumber1.close();
        userNumber2.close();
    }

    private static void handleSubtract() {
        System.out.println("Hello from subtract!");
        System.out.println("Please enter the first number!");
        Scanner userNumber1 = new Scanner(System.in);
        double num1 = userNumber1.nextDouble();
        System.out.println("Please enter the second number!");
        Scanner userNumber2 = new Scanner(System.in);
        double num2 = userNumber2.nextDouble();
        double result = subtract(num1, num2);
        System.out.println("Your total is: " + result);
        userNumber1.close();
        userNumber2.close();
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static void closeResources() {
        userInput.close();
    }
}
