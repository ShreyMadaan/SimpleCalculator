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
        System.out.println("Simple Calculator");
        System.out.println("Add: " + add(5,3));
        System.out.println("Subtract: " + subtract(5,3));
        System.out.println("Multiply: " + multiply(5,3));
        System.out.println("Divide: " + divide(5,3));
        System.out.println("Modulus: " + modulus(5,3));

    }
}
