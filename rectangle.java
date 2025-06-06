import java.util.*;
public class rectangle
{ 
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	double len=sc.nextDouble();
	double width=sc.nextDouble();
	double area=len*width;
	System.out.printf("Areaof rectangle with length %.2f and width %.2f is %.2f",len,width,area);

}
}