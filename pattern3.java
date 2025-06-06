import java.util.*;
public class pattern3
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string :");
	String s=sc.next();
	int l=s.length();
	int i;
	int j;
	System.out.println("\n");
	for(i=0;i<=l;i++)
	{
		for(j=0;j<i;j++)
		{
			System.out.print(s.charAt(j)+"");
		}
		System.out.println("\n");
	}
	for(i=l-1;i>=0;i--)
	{
		for(j=0;j<i;j++)
		{
			System.out.print(s.charAt(j)+"");
		}
		System.out.println("\n");
	}
}
}