import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number as string: ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);

            int[] values = {10, 20, 30, 40};
            System.out.println("Enter an index (from 0 to 3) to access: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + " is " + values[index]);
        } 
        catch (NumberFormatException e) {
            System.out.println("Number format exception: ");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception: ");
        } 
        catch (InputMismatchException e) {
            System.out.println("Input mismatch exception: ");
        } 
        catch (Exception e) {
            System.out.println("General exception: ");
        } 
        finally {
            System.out.println("End of calling catches");
            sc.close();
        }
    }
}

