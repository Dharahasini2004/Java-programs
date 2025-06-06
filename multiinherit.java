import java.util.Scanner;
class Animal{
    String name;
    void details(Scanner sc){
        System.out.println("\nEnter animal");
        name=sc.nextLine();
        
    }
    void showanimal(){
        System.out.println("\nAnimal: "+name);
    }
}

class mammal extends Animal{
    String type;
    void mammaltype(Scanner sc){
        System.out.println("\nEnter the animal type ");
        type=sc.nextLine();
    }
    void showmammal(){
        System.out.println("\nMammal type: "+type);
    }
}
class Dog extends mammal{
    String breed;
    void breeddetails(Scanner sc){
        System.out.println("\nEnter the dog breed ");
        breed=sc.nextLine();

    }
    void showDog(){
        System.out.println("\nDog breed: "+breed);
    }
}
public class multiinherit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog mydog=new Dog();
        mydog.details(sc);
        mydog.mammaltype(sc);
        mydog.breeddetails(sc);
        mydog.showanimal();
        mydog.showmammal();
        mydog.showDog();
        sc.close();

    }
    
}