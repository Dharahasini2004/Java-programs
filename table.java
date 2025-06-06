import java.util.*;
public class table
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	int i=1;
	System.out.println("\n");
	while(i<=10)
	{
		System.out.printf("%d * %d = %d\n",n,i,n*i);
		i++;
	}
	
}
}