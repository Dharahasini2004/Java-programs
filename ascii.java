import java.util.*;
public class ascii
{ 
public static void main(String args[])
{

	Scanner sc= new Scanner(System.in);
	//char letter='a';
	char letter=sc.next().charAt(0);
	int ascii=(int) letter;
	System.out.printf("%d",ascii);
}
}