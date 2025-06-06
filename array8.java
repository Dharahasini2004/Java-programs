import java.util.*;
public class array8
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string\n");
	String ns=sc.nextLine();
	String longp="";
	String shortp=null;
	int count=0;
	int len=ns.length();
	System.out.println("\nPalindromic subsequences are: \n");
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<=len;j++)
		{
			String sub=ns.substring(i,j);
			if(isPalindrome(sub))
			{
				if(sub.length()>1)
				{
				System.out.println(sub+"\n");
				count++;
				if(longp.length()<sub.length())
					longp=sub;
				if(shortp==null||shortp.length()>sub.length())
					shortp=sub;
				}
			}
		}
	}
	System.out.println("Total palindromic subsequences: "+count);
	System.out.println("");
	System.out.println("Longest palindromic subsequence is "+longp+" of length "+longp.length());
	System.out.println("");
	System.out.println("Shortest palindromic subsequence: "+shortp+" of length "+shortp.length());
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
	