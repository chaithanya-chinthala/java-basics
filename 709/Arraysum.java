import java.util.*;
public class Arraysum{
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Printing.....");
        for(int i=0;i<n;i++){
            sum+=arr[i];
            //System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}