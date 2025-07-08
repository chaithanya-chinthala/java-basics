// Pattern program to print +
import java.util.*;
public class Sample {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2||j==n/2){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
       /*int r=obj.nextInt();
        int c=obj.nextInt();
        int[][] arr=new int[r][c];
        //int res=0;
        System.out.println("Enter array elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
            arr[i][j]=obj.nextInt();
        }   
    } 
    System.out.println("sum of row wise elements:");
    //int res[][]=new int[r][c];
    int max1=0;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            if(arr[i][j]>max1)
            max1=arr[i][j];
           }
System.out.println(max1);
        }*/
        //int arr[]={10,19,27,35,48,3};
       /*  int r=obj.nextInt();
        int c=obj.nextInt();
        int[][] arr=new int[r][c];
        //int res=0;
        System.out.println("Enter array elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
            arr[i][j]=obj.nextInt();
        }   
    }  
      int row_no=0;
      int max_ones=0;
    for(int i=0; i<r; i++){
        int count=0;
        for(int j=0; j<c; j++){
            if(arr[i][j]==1){
                count+=1;
                if(count>max_ones){
                    max_ones=count;
                    row_no=i;


                }
            }     
}
    }
System.out.println("the row having maximun zeros: ");
System.out.println(row_no);*/
//int arr[]={3,4,5,32,23};
/*int n=obj.nextInt();
for(int i=0;i<n;i++){
    for(int j=0;j<i+1;j++){
        System.out.print("*");
    }
System.out.println( );
} 
for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        System.out.print("*");
    }
    System.out.println( );
}  */


    
    
