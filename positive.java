import java.util.*;
public class positive
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a=sc.nextInt();
	if(a>0)
		System.out.print("Positive");
	else if(a==0)
		System.out.print("Zero");
	else
		System.out.print("Negative");

}
}