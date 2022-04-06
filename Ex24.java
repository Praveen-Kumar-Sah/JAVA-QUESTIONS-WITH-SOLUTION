// find the factorial of a number using for loop
import java.util.*;
public class Ex24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n=sc.nextInt();
        sc.close();
        
        int fact=1;
        for(int i=n;i>=1;i--){
            fact = fact *i;
        }
        System.out.println("Factorial of given number is : "+fact);
    }
    
}
