// while loop in java
// find given number is palindrome or not
import java.util.*;
public class Ex42 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        sc.close();
        
        int temp = num;
        int revnum = 0;

        while(temp > 0){
            int lastd = temp % 10;
            revnum = revnum * 10  + lastd;
            temp /= 10 ;
        }
        if(revnum == num){
            System.out.println(num + " is palindrome number");
        }
        else{
            System.out.println(num + " is not palindrome number");
        }
    }
    
}
