import java.util.*;
public class Countmin{
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
        int count = 0;
        System.out.println("Enter k value:");
        int k = obj.nextInt();
        for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
        if (arr[i][j] < k) {
            count++;
        }
    }
}

    System.out.println("Count of elements less than " + k + ": " + count);
    obj.close();

    }
}


