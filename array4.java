import java.util.*;
public class array4
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the 1st string");
	String s1=sc.nextLine();
	System.out.println("Enter the 2nd string");
	String s2=sc.nextLine();
	s1=s1.replaceAll("\\s","").toLowerCase(); // \\s is to remove the spaces
	s2=s2.replaceAll("\\s","").toLowerCase();
	if(s1.length()!=s2.length())
	{
		System.out.println("The strings are not anagram with each other");
	}
	else
	{
	char[] ar1=s1.toCharArray();
	char[] ar2=s2.toCharArray();
	Arrays.sort(ar1);
	Arrays.sort(ar2);
	boolean isAnagram=Arrays.equals(ar1,ar2);
	if(isAnagram)
	{
		System.out.println("The strings are tom riddle's anagram");

	}
	else
	System.out.println("The strings are not anagram");
	}
	sc.close();
}
}