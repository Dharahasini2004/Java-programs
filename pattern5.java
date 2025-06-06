import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	System.out.println("Enter no:of rows:");
	int rows=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }

            System.out.println();         }
    }
}
