import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
  
	int a=sc.nextInt();
       System.out.println("a = "+a );
 
      int b=sc.nextInt();
     System.out.println("b= "+b );
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}