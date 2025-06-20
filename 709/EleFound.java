import java.util.*;
public class EleFound{
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
        System.out.println("Target element is:");
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                System.out.println(arr[i]+" is found");
                found = true;
                break;
            }
            }
             if(!found){
            System.out.println(tar + " is not found");
        }
            }
    }