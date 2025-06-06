import java.util.*;
public class str1
{ 
public static void main(String args[])
{

	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter 1st string");
	String str1=sc.nextLine();
	System.out.print("Enter 2nd string");
	String str2=sc.nextLine();
	String result=str1.concat(str2);
	System.out.println("Concated string=" +result);
	//compare
	boolean areEqual=str1.equals(str2);
	System.out.println(areEqual?"Equal":"Not Equal");
}
}