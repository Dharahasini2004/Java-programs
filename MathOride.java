import java.util.*;
class calc
{
    int a,b;
    void setValues(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void calculate()
    {
        int sum=a+b;
        System.out.println("Sum : "+sum);
    }
}
//class extra
class Extraop extends calc{
    @Override
    void calculate()
    {
        int product=a*b;
        System.out.println("Product from Child: "+product);
    }
}
public class MathOride {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=sc.nextInt();
	System.out.println("Enter second number:");
        int y=sc.nextInt();
	calc c=new calc();
	c.setValues(x,y);
	c.calculate();
    }
}