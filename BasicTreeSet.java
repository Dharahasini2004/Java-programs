//package lib;
import java.util.*;
public class BasicTreeSet
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	TreeSet<Integer> numbers=new TreeSet<>();
	System.out.println("Enter number of elements: ");
	int count=sc.nextInt();
	for(int i=0;i<count;i++)
	{
		System.out.println("Enter number"+(i+1)+": ");
		int num=sc.nextInt();
		numbers.add(num);
	}
	System.out.println("Numbers are:");
	for(int num: numbers)
	{
		System.out.println("");
		System.out.println(num);
		
	}
	sc.close();
}
}