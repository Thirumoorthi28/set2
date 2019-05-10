import java.io.*;
import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter The Value a and b :"+s);
         while (a < b) {
            boolean c = false;
            for(int i = 2; i <= a/2; ++i) {
               if(a % i == 0) {
                    c = true;
                    break;
                }
            }
            if (!c)
                System.out.println("The Prime Number : "+a);
            ++a;
        }
    }
}
