//11-6-2025
//manual excpetions
//illegal exception or argument excpetion
import java.util.Scanner;
public class manualexception {
    static void validateScore(int score){
        if(score<0 || score>100){
            throw new IllegalArgumentException("Score is above range of 0-100");
        }
        else{
            System.out.println("Valid score: "+score);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
       
    try{
        System.out.println("Enter score: ");
        int score=sc.nextInt();
        validateScore(score);
    } catch(IllegalArgumentException e){
        System.out.println("Exception caught: "+e.getMessage());
    } 
    finally{
        sc.close();
    }
}
}