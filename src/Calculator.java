import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");

        while (true) {
            System.out.print("Enter first number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // discard invalid input
                System.out.print("Enter first number: ");
            }
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, %) or 'x' to exit: ");
            String opInput = sc.next();
            char operator = opInput.charAt(0);

            if (operator == 'x' || operator == 'X') {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            if ("+-*/%".indexOf(operator) == -1) {
                System.out.println("Invalid operator! Please try again.");
                continue;
            }

            System.out.print("Enter second number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                System.out.print("Enter second number: ");
            }
            double num2 = sc.nextDouble();

            if (operator == '/' && num2 == 0) {
                System.out.println("Error: Cannot divide by zero!");
                continue;
            }

            double result = 0;
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                case '%':
                    result = modulus(num1, num2);
                    break;
            }

            System.out.println("Result: " + result);
            System.out.println("-------------------------");
        }

        sc.close();
    }     
}
