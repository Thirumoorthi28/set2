import java.io.*;
import java.util.Scanner;
public class Factorial{
 public static void main(String args[]){
     int a;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     System.out.println("Enter The Values :"+a);
     for(int i=1;i<=a;i++)
     System.out.println("The Multiplication Number of :"+(a*i));
 }   
}
