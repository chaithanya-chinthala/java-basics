//printing  average of the array elements
"""import java.util.*;
public class Sample2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
      System.out.println("enter size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        } 
        int len=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Average of array elements: ");
        System.out.println(sum/len);
    }
}"""
    //printing the half array 
    """import java.util.*;
public class Sample2{
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
    System.out.println("enter size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }int len=arr.length;
         int n1=len/2;
         for(int i=0;i<n1;i++){
            System.out.println(arr[i]);
         }
    }
}"""
    //print the even index elements in the array
    """import java.util.*;
public class Sample2{
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
    System.out.println("enter size of array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i+"->"+arr[i]);
         }
    }
}
}"""
//printing the 2D array 
"""import java.util.*;
public class Sample2{
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       System.out.println("enter rows and columns");
                int r=obj.nextInt();
                int c=obj.nextInt();
                int marks[][]=new int[r][c];
                System.out.println("enter arry elemnts");
                
                //System.out.println(marks.length);
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        marks[i][j]=obj.nextInt();
                    }
                }
                System.out.println("2D Array is :");
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                      System.out.print(marks[i][j]+" ");
                    }
                System.out.println(" ");
                }
    }
}"""
// printng the sum of the elements in an array
"""import java.util.Scanner;
public class Sample2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int r = obj.nextInt();
        int c = obj.nextInt();

        int[][] arr = new int[r][c];
        int res = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res += arr[i][j];
            }
        }

        System.out.println("Sum of matrix:");
        System.out.println(res);
    }
}"""
//printing the avarage of  matrix elements
"""import java.util.Scanner;
public class Sample2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int r=obj.nextInt();
        int c=obj.nextInt();
        int[][] arr=new int[r][c];
        int res=0;
        int len=r*c;
        System.out.println("Enter array elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
            arr[i][j]=obj.nextInt();
        }   
    } 
        for(int k=0; k<r; k++){
            for(int j=0;j<c;j++){
            res+=arr[k][j];
            }
        }
            System.out.println("Average  of matrix");
        System.out.println(res/len);
    }
}"""
//printing the maximum element in the matrix
"""import java.util.Scanner;
public class Sample2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
       int r=obj.nextInt();
        int c=obj.nextInt();
        int[][] arr=new int[r][c];
        //int res=0;
        System.out.println("Enter array elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
            arr[i][j]=obj.nextInt();
        }   
    } 
    int max=arr[0][0];
        for(int k=0; k<r; k++){
            for(int j=0;j<c;j++){
                if(arr[k][j]>max){
                    max=arr[k][j];
                }
            }
        }
            System.out.println("maximum element  of matrix");
        System.out.println(max); 
    }
}"""
    


