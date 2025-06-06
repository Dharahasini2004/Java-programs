import java.util.*;
public class array3
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int[] numbers={7,6,5,8,9};
	int sum=0;
	Arrays.sort(numbers);
	System.out.println("\nSorted array: ");
	for(int num: numbers)
	{
		System.out.println(num+" ");
	}
	System.out.println("");
	for(int num: numbers)
	{
		sum+=num;
	}
	System.out.println("Sum is: "+sum);

}
}