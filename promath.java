import java.util.*;

class mathop 
{
    protected int number;

    protected void setNumber(int num) 
   {
        number = num;
    }

    protected int square() 
   {
        return number * number;
    }

    protected int cube() 
   {
        return number * number * number;
    }
}
class result extends mathop 
{
    public void calc() 
    {
        System.out.println("\nSquare: " +square());
        System.out.println("\nCube : " +cube());
    }
}

public class promath {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        result obj = new result();
        System.out.println("\nEnter the number: ");
        int input = sc.nextInt();
        obj.setNumber(input); // Set the number in the object
        obj.calc();
    }
}