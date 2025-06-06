import java.util.*;
public class atm
{ 
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter user name: ");
	String username=sc.nextLine();
	System.out.print("Enter password: ");
	String password=sc.nextLine();
	float balance=10000;
	//sc.close();
	if (username.equals("SBI123"))
	{
		if (password.equals("1234"))
		{
			System.out.println("Enter amount to be with drawn");
			float amount=sc.nextFloat();
			if(amount<=balance)
				{
			
				System.out.println("Amount withdrawn: "+amount);
				System.out.printf("Withdrawl successful!!  Account balance: %f",(balance-amount));
				}
			else
				{
					System.out.println("Insufficient balance");
				}
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