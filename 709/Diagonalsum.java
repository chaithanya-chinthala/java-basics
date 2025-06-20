import java.util.*;
public class Diagonalsum{
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
        System.out.println("printing....");

    if (r != c) {
    System.out.println("Matrix is not square. Diagonal sum is undefined.");
} else {
    int sum = 0;
    for (int i = 0; i < r; i++) {
        sum += arr[i][i];  

        int secondaryCol = r - 1 - i;
        if (secondaryCol != i) {  
            sum += arr[i][secondaryCol];  
        }
    }
    System.out.println("Sum of diagonal elements: " + sum);
}
    }
}


