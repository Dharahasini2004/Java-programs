//12-6-2025
//package lib;
import java.util.*;
public class Vect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> numbers=new Vector<>();
        System.out.println("How many numbers do you want enter: ");
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\n\nEnter number "+(i+1)+":");
            numbers.add(sc.nextInt());
            //sum & avg
            int sum=0;
            for(int num: numbers){
                sum+=num;
            }
            double average=(n>0)?(double)sum/n:0;
            System.out.println("\nNumbers entered: "+numbers);
            System.out.println("\nSum: "+sum);
            System.out.println("\nAverage: "+average);
        }
        sc.close();
    }
}