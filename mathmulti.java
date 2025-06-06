// write a program 


import java.util.Scanner;
interface one{
    int add(int a,int b);
}
interface two{
    int multiply(int a,int b);
}
class three implements one,two{
    public int add(int a,int b) {
        return a+b;
    }
    public int multiply(int a,int b) {
        return a*b;
    }
}
public class mathmulti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        three obj=new three();
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("\n--------------RESULTS----------------\n");
        System.out.println("Addition of two numbers is: "+obj.add(a,b));
        System.out.println("Multiplication of two numbers is: "+obj.multiply(a,b));
        sc.close();
        }
    
}