//12-6-2025
import java.util.*;
public class BasicSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> cities=new HashSet<>();
        System.out.println("Enter number of cities: ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter the city "+(i+1)+": ");
            String city=sc.nextLine();
            cities.add(city);
        }
        System.out.println("\nUnique cities: ");
        for(String city: cities){
            System.out.println(city);
        }
        sc.close();
    }
}