import java.util.*;
interface Shape
{
    double area();
    double perimeter();
}
//implement interface shape in class called rectangle
class Rectangle implements Shape{
    double length;
    double breadth;

    Rectangle(double l,double b) {       //constructor
        length=l;
        breadth=b;
    }
    //implementation of math
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return (2*(length+breadth));
    }
}
public class inter1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the length: ");
	double length=sc.nextDouble();
	System.out.println("\nEnter the breadth: ");
	double breadth=sc.nextDouble();
	Shape r=new Rectangle(length,breadth);
	System.out.println("Area: "+r.area());
	System.out.println("Perimeter: "+r.perimeter());
	sc.close();
    }
}