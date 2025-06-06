import java.util.Scanner;
class student{
    String name;
    int marks;
    student(String n,int m){
        name=n;
        marks=m;
    }
    void display(){
        System.out.println("\nName: "+name);
        System.out.println("\nMarks: "+marks);
    }
}

public class constructor{ //constructor it is a special method that runs automatically when an object is created
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the student name: \n");
        String name=sc.nextLine();
        System.out.println("\nEnter the marks: \n");
        int  marks=sc.nextInt();
        student s1=new student(name,marks);
        s1.display();
        sc.close();
    }
    
}