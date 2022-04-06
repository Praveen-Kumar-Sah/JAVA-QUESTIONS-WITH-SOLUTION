// prime number or not
import java.util.*;
public class Ex27 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number  :");
        int num = sc.nextInt();
        sc.close();
        
        boolean isprime = true;

        for(int i=2; i<num; i++){
            if(num % i == 0){
                isprime = false;
                break;
            }
        }
        if (num < 2)isprime=false;

        System.out.println("It is a prime number : "+isprime);
    }
    
}
