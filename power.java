import java.util.*;
public class power
{ 
public static void main(String args[])
{

	Scanner sc= new Scanner(System.in);
	double base=sc.nextDouble();
	int expo=sc.nextInt();
	double res=Math.pow(base,expo);
	System.out.printf("Answer:%.2f",res);

}
}