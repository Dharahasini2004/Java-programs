import java.util.*;
public class pattern1
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	int i;
	int j;
	System.out.println("\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print("* ");
		}
		System.out.println("");

	}
}
}