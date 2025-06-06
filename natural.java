import java.util.*;
public class natural
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	System.out.println("\n\n");
	int i=1;
	while(i<=n)
	{
		if(i%2==0)
		{
		System.out.println("\n");
		System.out.println(""+i);
		}
		i=i+1;
	}
}
}