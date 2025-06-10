import java.util.*;
// encapsulation is for accessing data,clearing cache and firewalls
public class encap1
{
//encapsulated Student class
static class Student
{
	private String name;
	private int age;
	private double grade;
//private constructor for student class
	public Student(String name, int age, double grade)
	{
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	public String getName()
	{
		return name;
	}
	private int getAge()

	{
		return age;
	}
	private double getGrade()

	{
		return grade;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setAge(int age)
	{
		if(age>19)
		this.age=age;
		else
		System.out.println("Student is underage");
	}
	public void setGrade(double grade)
	{
		if(grade>=0&&grade<=100)
		this.grade=grade;
		else
		System.out.println("Invalid grade");	
	}
	public void displayDetails()
	{
		System.out.println("\nStudent details: \n");	
		System.out.println("Name: "+name);		
		System.out.println("Age: "+age);	
		System.out.println("Grade: "+grade);
	}
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the student name: ");
	String name=sc.nextLine();
	System.out.println("Enter the student age: ");
	int age=sc.nextInt();
	System.out.println("Enter the student grade: ");
	double grade=sc.nextDouble();
	Student student=new Student(name, age, grade);//new obj for stu class
	student.displayDetails();
	System.out.println("\n\n---Updating the students data---\n");//
	System.out.println("Enter the new name: ");
	sc.nextLine();//creating buffer before string name
	String newName=sc.nextLine();
	student.setName(newName);
	System.out.println("Enter the new age: ");
	int newAge=sc.nextInt();
	student.setAge(newAge);
	System.out.println("Enter the new grade: ");
	double newGrade=sc.nextDouble();
	student.setGrade(newGrade);
	student.displayDetails();
	sc.close();
}
}