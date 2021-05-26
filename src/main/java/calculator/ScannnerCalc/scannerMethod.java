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


            System.out.println("User input is currently: " + userInput);

            try {
                switch (userInput) {
                    case "add":
                        double num1 = getNumber();
                        double num2 = getNumber();
                        double answer = handleAdd(num1, num2);
                        System.out.println("The answer is: " + answer);
                        System.out.println("Returning to main menu.....");
                        continue;
                    case "subtract":
                        double subNum1 = getNumber();
                        double subNum2 = getNumber();
                        double subAnswer = handleSubtract(subNum1, subNum2);
                        System.out.println("The answer is: " + subAnswer);
                        System.out.println("Returning to main menu.....");
                        continue;
                    case "divide":
                        double divNum1 = getNumber();
                        double divNum2 = getNumber();
                        double divAnswer = handleDivide(divNum1, divNum2);
                        System.out.println("The answer is: " + divAnswer);
                        System.out.println("Returning to main menu.....");
                        continue;
                    case "multiply":
                        double mulNum1 = getNumber();
                        double mulNum2 = getNumber();
                        double mulAnswer = handleMultiply(mulNum1, mulNum2);
                        System.out.println("The answer is: " + mulAnswer);
                        System.out.println("Returning to main menu.....");
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

    private static void clearScanner(){
        uInput.nextLine();
    }

    private static double getNumber() {
        System.out.println("Please enter a number!");
        double number = uInput.nextDouble();
        return number;
    }


    private static double handleAdd(double num1, double num2) {
        double answer = 0;
        try {
            answer = add(num1, num2);
            clearScanner();
            return answer;
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);

            }
        }
        return answer;
    }

    private static double handleMultiply(double num1, double num2) {
        double answer = 0;
        try {
            answer = multiply(num1, num2);
            clearScanner();
            return answer;
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);
            }
        }
        return answer; // default return. Technically unreachable.
    }

    private static double handleDivide(double num1, double num2) {
        double answer = 0;
        try {
            answer = multiply(num1, num2);
            clearScanner();
            return answer;
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);
            }
        }
        return answer; // default return. Technically unreachable.
    }

    private static double handleSubtract(double num1, double num2) {
        double answer = 0;
        try {
            answer = subtract(num1, num2);
            clearScanner();
            return answer;
        } catch (Exception e) {
            //handle type mismatch exception.
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Sorry. That wasn't a recognized number. Returning to main Menu!");
            } else {
                System.out.println(e);
            }
        }
        return answer; // default return. Technically unreachable.
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
