import java.util.*;
class vehicle
{    //vehicle
	private String model;
	private int speed;
	private final int MAX_SPEED=120;  //speed lim of vehicle
	public vehicle(String model)
	{
		this.model=model;
		this.speed=0;
		
	}
	public  void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void accelerate(int increment)
	{
		if(speed+increment<MAX_SPEED)
		{
			speed=speed+increment;
			System.out.println("\nIncreased speed by "+increment+"km/h\n");
		}
		else
		{
			speed=MAX_SPEED;
			System.out.println("Reached maximum speed"+MAX_SPEED+"km/h");
		}
	}
	//method to initialize proximity warning
	public void brake(int decrement)
	{
		if(speed-decrement>=0)
		{
			speed-=decrement;
			System.out.println("\nBrake by "+decrement+"km/h\n");
		}
		else
		{
			speed=0;
			System.out.println("Vehicle is stopped");
		}
	}
	public String getModel()
	{
		return model;
	}
}
	public class encap2
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter the model name: \n");
			String model=sc.nextLine();
			vehicle car=new vehicle(model);
			System.out.println("\nCurrent speed: "+car.getSpeed()+"km/h");
			System.out.print("\nEnter speed to accelerate: ");
			int acc=sc.nextInt();
			car.accelerate(acc);	
			System.out.println("Current speed: "+car.getSpeed()+"km/h");
			System.out.print("\nEnter speed to brake: ");
			int brake=sc.nextInt();
			car.brake(brake);	
			System.out.println("Current speed: "+car.getSpeed()+"km/h");
			sc.close();
		}
	}