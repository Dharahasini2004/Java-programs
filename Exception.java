//11-6-2025
//Exceptions
// - runtime errors
// -errors in program folow can accessed and resolved exceptional classes
//object
//----------throwable 
//          ------------------errors Outof memory, stack overflow
//      unchecked exception----|--------exception
// nullpointer exceptions-|              |------check exception
//                                            |------IO exceptions,SQL Exception
//excpetions
//1.checked exception
//-----handle compile time
//2.unchecked
//-----handle runtime
//3.Errors
//keywords: 
//try
//catch---try to resolve the exception
//finally--if there is error or not, it executes always
//throw--overall code
//throws--checking in methods
//try block
//try{
//} finally{
//}
import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int a=sc.nextInt();
            System.out.println("You entered "+a);
        } finally {
            sc.close();
        }
    }
}