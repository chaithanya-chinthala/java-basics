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
/*int arr[]={9,0,3,5,4};
Arrays.sort(arr);
for(int i:arr){
    System.out.println(i);
}*/
/*int[] arr={4,3,9,6,0};
int[] arr1={4,3,9,6,0};
System.out.println(Arrays.equals(arr,arr1));*/

/*int arr2[]= new int[5];
Arrays.fill(arr2,10);
for(int i:arr2){
    System.out.println(i);
}
System.out.println(Arrays.toString(arr2));*/
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
  int n=obj.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
        arr[i]=obj.nextInt();
    }
    int maxi=arr[0];
    int mini=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>maxi){
            maxi=arr[i];
        }
        if(arr[i]<mini){
            mini=arr[i];
        }
    }
    int maxi2=0;
    int mini2=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>maxi2 && arr[i]!=maxi){
            maxi2=arr[i];
        }
        if(arr[i]<mini2 && arr[i]!=mini){
            mini2=arr[i];
        }
    }
    System.out.println(maxi2+" is the second maximum element");
    System.out.println(mini2+" is the second  minimum element");
  }

 }


    
    
