import java.io.*; 
import java.util.Scanner; 
public class Arithmetic{
public static void main(String args[]){
    int a,n,d,s1;
    Scanner s=new Scanner(System.in); 
    n=s.nextInt();
    System.out.println("Enter  The Number Of a :"+n);
    a=s.nextInt();
    System.out.println("Enter  The Number Of a :"+a);
    d=s.nextInt();
    System.out.println("Enter  The Number Of a :"+d);
    s1= (n*(2*a+(n-1)*d)/2); 
    int r=Math.round(s1);
    System.out.println("The Arithmetic Progression Number :"+s1);
} 
}
