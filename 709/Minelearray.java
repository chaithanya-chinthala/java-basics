import java.util.*;

public class Minelearray{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter r& c:");
        int r = obj.nextInt();
        int c = obj.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter array elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        int min = arr[0][0];
        for (int k = 0; k < r; k++) {
            for (int j = 0; j < c; j++) {
                min = Math.min(min, arr[k][j]);
            }
        }
        System.out.println("Minimum element of matrix");
        System.out.println(min);
        obj.close();
    }
}


