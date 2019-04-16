import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
	 Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     System.out.print("Enter The Value:"+n);
     int sum = 0, r;
	 int temp = n;    
     while(n>0){
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }    
      if(temp==sum)    
        System.out.println(" =>It Is a Palindrome number.");    
      else    
        System.out.println(" =>It Is Not a palindrome.");    
     }  
}
