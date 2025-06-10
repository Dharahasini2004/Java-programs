import java.util.Scanner;
class DotMatrixPrinter{
    public void print(String content){
        System.out.println("Printing with dot matrix"+content);
    }
}
class PrintManager{
    DotMatrixPrinter printer=new DotMatrixPrinter();
    public void printDocument(String content){
        System.out.println(content);
    }

    public DotMatrixPrinter getPrinter() {
        return printer;
    }
}
public class couple{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Document content : ");
        String doc=sc.nextLine();
        System.out.println("");
        System.out.println("");
        PrintManager manager=new PrintManager();
        manager.printDocument(doc);
        sc.close();
    }
}