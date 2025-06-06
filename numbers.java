import java.util.Scanner;

class InputNumbers {
    int a, b;

    void getInputs(Scanner scanner) {
        System.out.println("Enter first number (a):");
        a = scanner.nextInt();
        System.out.println("Enter second number (b):");
        b = scanner.nextInt();
    }
}

class PowerCalculator extends InputNumbers {
    void power() {
        if (b < 0) {
            System.out.println("Error: Exponent cannot be negative.");
            return;
        }
        int result = 1;
        if (b == 0) {
            result = 1; // Any number to the power of 0 is 1
        } else {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        }
        System.out.println("Power (" + a + "^" + b + "): " + result);
    }
}

class FactorialCalculator extends PowerCalculator {
    int factorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return -1; // Indicate an error
        }
        if (n == 0 || n == 1) {
            return 1; // Base cases for factorial
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    void showFactorials() {
        System.out.println("Factorial of " + a + ": " + factorial(a));
        System.out.println("Factorial of " + b + ": " + factorial(b));
    }
}

public class numbers { // Changed class name to Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactorialCalculator obj = new FactorialCalculator();
        obj.getInputs(scanner); // Corrected method name
        System.out.println();
        obj.power();
        obj.showFactorials(); // Corrected method name
        scanner.close();
    }
}