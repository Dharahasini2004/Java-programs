import java.util.*;
public class array2
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int[] numbers={7,6,5,8,9};
	int sum=0;
	System.out.println("Enter 5 subject marks: ");
	System.out.println("\n");
	for(int num: numbers)
	{
		sum+=num;
	}
	System.out.println(""+sum);

}
}