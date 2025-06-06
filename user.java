import java.util.*;
public class user
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter user name: ");
	String username=sc.nextLine();
	System.out.print("Enter password: ");
	String password=sc.nextLine();
	//sc.close();
	if (username.equals("Dhara"))
	{
		if (password.equals("1234"))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Wrong password");
		}
	}
	else
	{
		System.out.println("Invalid username");
	}
	
}
}