import java.util.*;
public class array7
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String ns=sc.nextLine();
	int count=0;
	int len=ns.length();
	System.out.println("Palindromic subsequences are ");
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<=len;j++)
		{
			String sub=ns.substring(i,j);
			if(isPalindrome(sub))
			{
				if(sub.length()>1){
				System.out.println(sub);
				count++;}
			}
		}
	}
	System.out.println("Total palindromic subsequences: "+count);
	sc.close();
}
public static boolean isPalindrome(String str)
{
	int left=0;
	int right=str.length()-1;
	while(left<right)
	{
		if(str.charAt(left)!=str.charAt(right))
		{
			return false;
		}
		left++;
		right--;
	}
	return true;
}
}
	