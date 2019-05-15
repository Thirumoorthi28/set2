import java.io.*;
import java.util.Scanner;
public class Factorial{
 public static void main(String args[]){
     int a,i=1;
     long fact=1;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     System.out.println("Enter The Values :"+a);
     while(i<=a){
     fact*=i;
     i++;
     }
     System.out.println("The Factorial Number of :"+fact);
 }   
}
