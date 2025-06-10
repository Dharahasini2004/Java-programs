import java.util.*;
interface basop
{
	void add(int a,int b);
}
interface advop extends basop
{
	void mul(int a,int b);
}
class cal implements advop
{
	public void add(int a,int b)
	{
		System.out.println("\nAddition: "+(a+b));
	}
	public void mul(int a,int b)
	{
		System.out.println("\nMultiplication: "+(a*b));
	}
}
public class inter3 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a: ");
	int x=sc.nextInt();
	System.out.print("\nEnter b: ");
	int y=sc.nextInt();
	System.out.println("\nObject defining and accessing  ");
	cal c=new cal();
	c.add(x,y);
	c.mul(x,y);
	sc.close();
}
}