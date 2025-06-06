import java.util.*;
class pet{
    String name;
    public void sound(){
        System.out.println("Animal sounds only!!!!");
    }
}
class dog extends pet{
    @Override
    public void sound(){
        System.out.println(name+" says Woof");
    }
}
public class coverride{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        dog mydog = new dog();
        System.out.print("Enter your dog's name: ");
        mydog.name = sc.nextLine();
        mydog.sound(); 
    }
}