import java.util.*;
class operation{
    void calculate(int n){
        System.out.println("Genreal Operation "+n);   
    }
}
class power extends operation{
    void calculate(int n){
    System.out.println("Square of "+n+"is "+(n*n));
    }
}
class factorial extends operation{
    void calculate(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
public class OperOverr{
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        operation op;
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        op=new power();
        op.calculate(num);
        op=new factorial();
        op.calculate(num);
    }
}