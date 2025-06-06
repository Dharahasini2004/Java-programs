import java.util.*;
public class reverse
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	int sum=0;
	System.out.println("\n\n");
	while(n>0)
	{
		sum=sum*10+n%10;
		n=n/10;
	}
	System.out.println(""+sum);
}
}