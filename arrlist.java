import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String>fruits=new ArrayList<>();
        System.out.println("How many fruits: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("\nEnter fruit: "+(i+1)+" ");
            String fruit=sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println("\nFruits List: "+fruits);
        System.out.println("\nEnter index value:  ");
        int index=sc.nextInt();
        if(index>=0 && index<fruits.size()){
            System.out.println("\nFruit at index "+index+": "+fruits.get(index));
        }
        else{
            System.out.println("\nInvalid index");
        }
        //remove by name
        sc.nextLine();
        System.out.println("\nEnter the fruit name you want to delete: ");
        String toRemove=sc.nextLine();
        if(fruits.remove(toRemove)){
            System.out.println(toRemove+" is deleted from the list");
        }
        else{
            System.out.println(toRemove+ " is Not found");
        }
        System.out.println("\nUpdated Fruit List"+fruits);
        sc.close();
    }
}