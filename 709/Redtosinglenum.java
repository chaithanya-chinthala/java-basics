import java.util.*;
        public class Redtosinglenum{
        public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=obj.nextInt();
        int sum=0;
        while (a>0){
            int digit=a%10;
            sum +=digit;
            a/=10;
        }
            int sum2=0;
            while(sum>0){
            int b=sum%10;
            sum2 +=b;
            sum/=10;
        }
        System.out.println(sum2);
         }
}