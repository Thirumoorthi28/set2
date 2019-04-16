import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
    int n,i=2;
	 Scanner s = new Scanner(System.in);
     n = s.nextInt();
     System.out.print("Enter The Value:"+n);
     boolean flag = false;
     while(i <=n/2){
            if(n% i == 0){
                flag = true;
                break;
            }
           ++i;
        }
        if (!flag)
            System.out.println("  => It Is A PRIME NUMBER.");
        else
            System.out.println("  =>It Is Not A PRIME NUMBER.");
    }
}
