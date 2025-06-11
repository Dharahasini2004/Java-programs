//10-6-2024
//lambda functions
//(parameters)->{body}
// (int x,int y)->{return a/b}
import java.util.Scanner;
@FunctionalInterface
interface Operation{
    int compute(int a,int b);
}
public class lambdafun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        System.out.println("Enter hte value of y: ");
        int y=sc.nextInt();
        Operation add=(a,b) -> a+b;
        Operation sub=(a,b)-> a-b;
        Operation mul=(a,b)-> a*b;
        Operation div=(a,b)-> b!=0 ? a/b: 0;
        System.out.println("Addition: "+add.compute(x, y));
        System.out.println("Subtraction: "+sub.compute(x, y));
        System.out.println("Multiplication: "+mul.compute(x, y));
        System.out.println("Division: "+div.compute(x, y));
        sc.close();
    }
}