//11-6-2025
import java.util.Scanner;
public class Buff {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter your name: ");
            String name=sc.nextLine();
            System.out.println("\nHello, "+name+"!");
        }
    }
}