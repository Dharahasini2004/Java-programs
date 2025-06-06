import java.util.*;
public class array5
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the 1st string");
	String s1=sc.nextLine();
	s1=s1.replaceAll("\\s","").toLowerCase(); 
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
	s2+=s1.charAt(i);	
	}
	if(s1.equals(s2))
	System.out.println("Palindrome");
	else
	System.out.println("Not a Palindrome");
	sc.close();
}
}