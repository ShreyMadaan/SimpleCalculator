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
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        double result = 0;

        switch (operator) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
            case '%':
                result = modulus(a, b);
                break;
            default:
                 System.out.println("Error: Invalid operator");
                 sc.close();
                 return;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
