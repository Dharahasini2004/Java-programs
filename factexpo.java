import java.util.*;
class Fact {
    public long calcFact(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
class Expo extends Fact {
    public double calcExpo(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

public class factexpo {
    public static void main(String[] args) {
        Expo obj = new Expo();
        Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter number, base and exponent\n");

        int number = sc.nextInt();
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        long factorial = obj.calcFact(number);
        double power = obj.calcExpo(base, exponent);
	System.out.println();
        System.out.println("\nFactorial of " + number + " is: " + factorial);
	System.out.println();
        System.out.println(base + " to the power of " + exponent + " is: " + power);
    }
}
