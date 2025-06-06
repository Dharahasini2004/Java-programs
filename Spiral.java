import java.util.*;
public class Spiral {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            // left to right
            int i = left;
            while (i <= right && value <= n * n) {
                matrix[top][i] = value++;
                i++;
            }
            top++;

            // top to bottom
            int j = top;
            while (j <= bottom && value <= n * n) {
                matrix[j][right] = value++;
                j++;
            }
            right--;

            // right to left
            int k = right;
            while (k >= left && value <= n * n) {
                matrix[bottom][k] = value++;
                k--;
            }
            bottom--;

            // bottom to top
            int l = bottom;
            while (l >= top && value <= n * n) {
                matrix[l][left] = value++;
                l--;
            }
            left++;
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.printf("%3d ", matrix[r][c]);
            }
            System.out.println("\n");
        }
    }
}
