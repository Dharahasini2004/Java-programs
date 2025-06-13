//package lib;
import java.util.*;
public class docApp
{
public static void main(String[] args) 
{
        Scanner sc=new Scanner(System.in);
	LinkedList<String> waitingList=new LinkedList<>();
	while(true)
	{
		System.out.println("\n----Doctor's appointment system: ");
		System.out.println("1. Add patient");
		System.out.println("2. Served patient");
		System.out.println("3. View waiting list");
		System.out.println("4. Exit");
		System.out.println("\nEnter your choice: ");
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1:
				System.out.println("Enter the patient name: ");
				String name=sc.nextLine();
				waitingList.addLast(name);
				System.out.println(name+" is added to the waiting list");
				break;
			case 2:
				if(!waitingList.isEmpty())
				{
					String served=waitingList.removeFirst();
					System.out.println(served+" has been visited by the doctor");
				}else{
				System.out.println("No patients in the queue");
				}
				break;
			case 3:
				System.out.println("Current waiting list: "+waitingList);
				break;
			case 4:
				System.out.println("Exiting system ");
				sc.close();
				return;
			default:
				System.out.println("Invalid index ");
		}
	}
}
}
