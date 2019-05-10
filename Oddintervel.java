import java.io.*;
import java.util.Scanner;
public class Oddintervel{
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter The Value a and b :"+s);
        a++;
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0)
            System.out.println("The Odd Numbers OF :" +i);
        }
    }
}
