import java.util.*;
public class array1
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int[] marks=new int[5];
	System.out.println("Enter 5 subject marks: ");
	System.out.println("\n");
	for(int i=0;i<marks.length;i++)
	{
		marks[i]=sc.nextInt(); 
	}
	for(int i=0;i<marks.length;i++)
	{
		System.out.print("Element at index "+i+":"+marks[i]+"\n");
	}
}
}