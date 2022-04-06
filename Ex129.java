// Write a program to find the factorial of a number using function
import java.util.*;

public class Ex129 {

    static int fact(int n){
        int f = 1;
        for(int i=n; i>=1; i--){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        // calling function
        System.out.println("Factorial of "+ num +" is : "+ fact(num));
    }
}
