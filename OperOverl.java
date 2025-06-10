import java.util.*;
class mathop
{
	 int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class OperOverl
{
	public static void main(String args[])
	{
		mathop mo=new mathop();
		System.out.println("\nAddition: "+mo.add(2,4));
		System.out.println("\nAddition: "+mo.add(3.4,7.6));
		System.out.println("\nAddition: "+mo.add(4,5,7));
	}
}