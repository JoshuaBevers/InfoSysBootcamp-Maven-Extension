package calculator.ScannnerCalc;

import java.util.Scanner;

public class scannerMethod {

    public static Scanner uInput = new Scanner(System.in);

    public static void Scanners() {
        boolean runState = true;

        while (runState == true) {
            System.out.println("Please type in a mode below:");
            System.out.println("add: adds two numbers.");
            System.out.println("subtract: Subtracts two numbers");
            System.out.println("multiply: multiplies two numbers");
            System.out.println("divide: Divides two numbers");
            System.out.println("exit: exits the program");
            String userInput = uInput.nextLine();
            try {
                switch (userInput) {
                    case "add":
                        handleAdd();
                        continue;
                    case "subtract":
                        handleSubtract();
                        continue;
                    case "divide":
                        handleDivide();
                        continue;
                    case "multiply":
                        handleMultiply();
                        continue;
                    case "exit":
                        runState = false;
                        break;
                    default:
                        System.out.println("Sorry. We didn't recognize that input! Try again.");
                        continue;
                }

            } catch (Exception e) {
                if (e.toString() == "java.util.InputMismatchException") {
                    System.out.println("Sorry. That wasn't a recognized input");
                    continue;
                } else {
                    System.out.println(e);
                }

            }

        }
        closeResources();
    }


    private static void handleAdd() {
        try {
            System.out.println("Please enter the first number!");
            double num1 = uInput.nextDouble();
            System.out.println("Please enter the second number!");
            double num2 = uInput.nextDouble();
            System.out.println(add(num1, num2));
            System.out.println("Returning to main menu.....");
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);
            }
        }
    }

    private static void handleMultiply() {
        try {
            System.out.println("Please enter the first number!");
            double num1 = uInput.nextDouble();
            System.out.println("Please enter the second number!");
            double num2 = uInput.nextDouble();
            System.out.println(multiply(num1, num2));
            System.out.println("Returning to main menu.....");
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);
            }
        }
    }

    private static void handleDivide() {
        try {
            System.out.println("Please enter the first number!");
            double num1 = uInput.nextDouble();
            System.out.println("Please enter the second number!");
            double num2 = uInput.nextDouble();
            if(num2 == 0) {
                System.out.println("Sorry. You can't divide by 0.");
                handleDivide();
            }

            System.out.println(divide(num1, num2));
            System.out.println("Returning to main menu.....");
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);
            }
        }
    }

    private static void handleSubtract() {
        try {
            System.out.println("Please enter the first number!");
            double num1 = uInput.nextDouble();
            System.out.println("Please enter the second number!");
            double num2 = uInput.nextDouble();
            System.out.println(subtract(num1, num2));
            System.out.println("Returning to main menu.....");
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);
            }
        }
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
        System.out.println("closing scanners. Have a nice Day!");
        uInput.close();
    }
}
