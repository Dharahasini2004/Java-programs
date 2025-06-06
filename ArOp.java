import java.util.*;
class ArOp 
{
 void perform()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 values:\n");
        int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("\nAddition: "+(a+b));
	System.out.println("");
	System.out.println("Subtraction: "+(a-b));
	System.out.println("");
	System.out.println("Product: "+(a*b));
	System.out.println("");
	System.out.println("Quotient: "+(a/b));
	System.out.println("");
	System.out.println("Remainder: "+(a%b));
}
public static void main(String[] args) 
{
	ArOp obj=new ArOp();  //classname object name=new classname()
	obj.perform(); //objectname.function name
}
}