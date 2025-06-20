import java.util.*;
public class Foreachloop{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        for(int c : arr){
            System.out.println(c);  
        }
    }
}