//11-6-2025

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int num1=sc.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("Exception occured");
        }finally{
            System.out.println("This block of code always execute");
            sc.close();
        }
    }
}