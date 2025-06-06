import java.util.Scanner;
public class io{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("integer");
int number=sc.nextInt();

System.out.println("float");
float deci=sc.nextFloat();

System.out.println("word");
String word=sc.next();

sc.nextLine();
System.out.println("sentence");
String sen=sc.nextLine();
System.out.println("-----------Output------------");
System.out.println("Integer: "+number);
System.out.println("Float: "+deci);
System.out.println("Word: "+word);
System.out.println("Sentence: "+sen);
sc.close();
}
}

