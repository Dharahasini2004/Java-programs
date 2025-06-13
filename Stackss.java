import java.util.*;
public class Stackss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String>books = new Stack<>();
        System.out.println("How many books");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter book "+(i+1)+":");
            books.push(sc.nextLine());
        }
        //show the stack
        System.out.println("\nBooks in the stack, top->bottom"+books);
        if(!books.isEmpty()){
            System.out.println("Top book: "+books.peek());
            System.out.println("Removing a book: "+books.pop());
        }
        System.out.println("Stack after pop: "+books);
        sc.close();
    }
}