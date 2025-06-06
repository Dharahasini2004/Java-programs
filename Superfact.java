import java.util.*;
public class Superfact
{
int facto(int n)
{    
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact*=i;
	}
	return fact;
}
long calcfact(int n)
{
	long sf=1;
	for(int i=1;i<=n;i++)
	{
		sf*=facto(i);
	}
	return sf;
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	Superfact obj=new Superfact();
	System.out.println("\nEnter a value:\n");
        int a = sc.nextInt();
	long result=obj.calcfact(a);
	System.out.println("Super factorial of "+a+" is "+result);
	sc.close();
}
}