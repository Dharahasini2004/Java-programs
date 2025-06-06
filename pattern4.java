import java.util.*;
public class pattern4
{ 
public static void main(String args[])  
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	int i;
	int j;
	int r=1;
	System.out.println("\n");
	for(i=0;i<=n;i++)
	{
		for(j=0;j<i;j++)
		{
			System.out.print(" \t"+(r++));
		}
		System.out.println("\n");

	}
}
}