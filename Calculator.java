import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Simple Calculator");
        System.out.println("Created by Aerucodes");
        System.out.println("----------------");

        // Get first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Get second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                scanner.close();
                return;
        }

        // Display result
        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        scanner.close();
    }
} 