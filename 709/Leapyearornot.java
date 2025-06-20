import java.util.*;
    public class Leapyearornot{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a year:");
        int n = obj.nextInt();
        if(n%400==0 || (n%4==0 && n%100!=0)){
          System.out.println(n+" leap year");
       }
        else{
          System.out.println(n+" not a leap year");
    }
    }
}