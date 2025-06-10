//10-6-2025
//loose coupling
import java.util.Scanner;
//using abstraction interface
interface Printer{
    void print(String content);
}
//a concrete class for implementation
class LaserPrinter implements Printer{
    public void print(String content){
        System.out.println("Laser Printer OutPut "+content);
    }
}
// another concrete class for implementation
class InkjetPrinter implements Printer{
    public void print(String content){
        System.out.println("Inkjet Printer OutPut "+content);
    }
}
//manager class using interface(abstract)
class PrintManager{
    Printer printer;
    public PrintManager(Printer printer){
        this.printer=printer;
    }
    public void printDocument(String content){
        printer.print(content);
    }
}
public class loosecouple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a document: ");
        String doc = sc.nextLine();
        System.out.println("Choose printer");
        System.out.println("1. Laser Printer");
        System.out.println("2. Inkjet Printer");
        int choice = sc.nextInt();
        Printer printer;

        if (choice == 1) {
            printer = new LaserPrinter();
        } else {
            printer = new InkjetPrinter();
        }

        // This part was missing:
        PrintManager manager = new PrintManager(printer);
        manager.printDocument(doc);

        sc.close();
    }
}
