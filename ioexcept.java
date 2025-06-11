//11-6-2025
import java.io.IOException;
import java.util.Scanner;
public class ioexcept {
    static void readInput() throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any data: ");
        String input=sc.nextLine();
        System.out.println("You have entered "+input);
        sc.close();
    };
    public static void main(String[] args) {
        try{
            readInput();
        } catch(IOException e){
            System.out.println("IOException occured");
        }
    }
}