import java.io.*;
import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        int a,n,r,result=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter The Value a :"+s);
        n = a;
        while (n!= 0)
        {
            r =n% 10;
            result += Math.pow(r, 3);
            n/= 10;
        }
        if(result ==a)
            System.out.println(a + " :YES");
        else
            System.out.println(a + " :NO");
    }
}
