// while loop and do-while loop in java
// sum of the digit using while loop
import java.util.*;
public class Ex40 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        sc.close();
        
        int sum =0;
        int  temp=num;

        while(temp>=1){
            int lastd= temp%10;
            temp /= 10;
            sum = sum+lastd;
        }
        System.out.println("The sum of given  digit "+ num +" is : "+sum);
    }
    
}
