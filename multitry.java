import java.util.*;
public class multitry
{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    try{
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        //input mismatch exception
        try{
            int res=100/num;
            System.out.println("result: "+res);
            try{
                int[] arr=new int[5];
                System.out.println("Accessing array element"+arr[10]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inner most catch: "+e.getMessage());
            }
        }catch(ArithmeticException e){
            System.out.println("Middle-catch: "+e.getMessage());
        }
}catch(Exception e){
    System.out.println("Outer-catch:Invalid input.please enter a number: ");
}
System.out.println("Program ended");
s.close();
}
}