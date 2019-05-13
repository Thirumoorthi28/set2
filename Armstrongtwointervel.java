import java.io.*;
import java.util.Scanner;
public class Armstrongbetweentwonum{
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter The 1st Number :"+a);
        b=s.nextInt();
        System.out.println("Enter The 2nd Number :"+b);
        for (int i=a;i<b;i++){
         int c,r,sum = 0;
         c= i;
         while(c!= 0) {
            r=c%10;
            sum=sum+(r*r*r);
            c=c/10;
         }
         if(sum==i){
            System.out.println(""+i+" : This Is An Armstrong Number");
         }
      }
   }
}
