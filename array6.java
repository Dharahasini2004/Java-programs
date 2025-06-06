import java.util.*;
public class array6
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String s1=sc.nextLine();
	String ns= s1.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); 
	boolean isPalindrome=true;
	int left=0;
	int right=ns.length()-1;
	while(left<right)
	{
		if(ns.charAt(left)!=ns.charAt(right))
		{
			isPalindrome=false;
			break;
		}
		left++;
		right--;
	}
	if(isPalindrome)
	System.out.println("Palindrome");
	else
	System.out.println("Not a Palindrome");
	sc.close();
}
}