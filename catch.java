//11-6-2025
//catch block
import java.util.Scanner;
public class Catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int num1=sc.nextInt();
            System.out.println("Enter second number: ");
            int num2=sc.nextInt();
            int result=num1/num2;
            System.out.println("Result: "+result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: Division by zero exception");
        }finally{
            sc.close();
        }
    }
}