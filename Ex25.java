// fibonacii series of given number using for loop
import java.util.*;
public class Ex25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        sc.close();
        
        int a=0;
        int b=1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=2; i<=n; i++){
            int c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    
}
