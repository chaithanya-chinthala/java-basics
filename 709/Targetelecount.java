import java.util.*;
public class Targetelecount{
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
    System.out.println("enter size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter the target element:");
        int tar=obj.nextInt();
        int count=0;
        System.out.println("Target element count is:");
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                 count+=1;
            }
            }
        System.out.println(count);
        }
    }