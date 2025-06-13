//12-6-2025
import java.util.*;
public class BasicTreeMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<String, String> CountryCapital=new TreeMap<>();
        System.out.println("Enter number of countries: ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter the Country name: "+(i+1)+": ");
            String country=sc.nextLine();
            System.out.println("Enter the capital name "+country+": ");
            String capital=sc.nextLine();
            CountryCapital.put(country,capital);
        }
        System.out.println("\nCountries and their capitals");
        for(Map.Entry<String, String> entry: CountryCapital.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
        sc.close();
    }
}