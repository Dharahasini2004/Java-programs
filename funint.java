import java.util.*;
@FunctionalInterface
interface Hi{
    void sayHello(String name);
}
public class functionalint 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name=sc.nextLine();
        Hi greeting=(n)-> System.out.println("\nHello, "+n+"! Good morning");
        greeting.sayHello(name);
        sc.close();
    }
}