import java.util.*;
public class Countposneg{
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Printing.....");
        int count_pos=0;
        int count_neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                count_pos+=1;
              }
            else if(arr[i]<0){
                count_neg+=1;
            }
        }
        System.out.println(count_pos);
        System.out.println(count_neg);
    }
}