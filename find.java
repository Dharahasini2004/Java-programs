import java.util.*;
public class find
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number:");
	int a=sc.nextInt();
	System.out.print("Enter a number:");
	int b=sc.nextInt();
	int max=(a>b)?a:b;
	System.out.println("Maximum= "+max);
}
}