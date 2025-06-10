import java.util.*;
interface Area
{
    double Carea();
}
interface Perimeter
{
    double Cperimeter();
}
//implement interface shape in class called rectangle
class Rectangle implements Area, Perimeter{
    double length;
    double breadth;
    Rectangle(double length,double breadth) {       //constructor
        this.length=length;
        this.breadth=breadth;
    }
    //implementation of math
    public double Carea()
    {
        return length*breadth;
    }
    public double Cperimeter()
    {
        return (2*(length+breadth));
    }
}
public class inter2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the length: ");
	double length=sc.nextDouble();
	System.out.print("\nEnter the breadth: ");
	double breadth=sc.nextDouble();
	Rectangle r=new Rectangle(length,breadth);
	System.out.println("\nArea: "+r.Carea());
	System.out.println("\nPerimeter: "+r.Cperimeter());
	sc.close();
    }
}