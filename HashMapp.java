//12-6-2025
//package lib;
import java.util.*;
public class HashMapp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> priceMap=new HashMap<>();
        System.out.println("No. of products: ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter product name: ");//
            String product=sc.nextLine();
            System.out.println("Enter price of "+product+":");
            int price=sc.nextInt();
            sc.nextLine();
            priceMap.put(product,price);
        }
        System.out.println("\nProduct price list");
        for(Map.Entry<String,Integer> entry:priceMap.entrySet()){
            System.out.println(entry.getKey()+"=> ₹"+entry.getValue());
        }
        // product search 
        System.out.println("Enter product name: ");
        String searchProduct=sc.nextLine();
        if(priceMap.containsKey(searchProduct)){
            System.out.println("Price of "+searchProduct+" is:"+priceMap);
        } else{
            System.out.println("Price not found");
        }
        //removal of items
        System.out.println("Enter product to remove: ");
        String removeProduct=sc.nextLine();
        if(priceMap.remove(removeProduct)!=null){
            System.out.println(removeProduct+" Removed");
        }
        else{
            System.out.println("Product not found");
        }
        //final list
        System.out.println("Updated product price list");
        for(Map.Entry<String,Integer> entry: priceMap.entrySet()){
            System.out.println(entry.getKey()+"=>₹"+entry.getValue());
        }
        sc.close();
    }
}