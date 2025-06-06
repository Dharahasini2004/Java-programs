import java.util.*;
class person{
    protected String name;
    protected void setname(String name){
        this.name=name;
}
protected void displayname(){
    System.out.println("\nName: "+name);
}
}
class boy extends person{
    protected float height;
    protected void setheight(float height){
        this.height=height;
    }
    public void displaydetails(){
        displayname();
        System.out.println("\nHeight: "+height);
    }
}
public class const2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boy b=new boy();
        System.out.println("\nEnter the name: ");
        String nameinput=sc.nextLine();
        b.setname(nameinput);
        System.out.println("\nEnter height: ");
        float height=sc.nextFloat();
        b.setheight(height);
        System.out.println("\n\n----------person details---------");
        b.displaydetails();
    }
}