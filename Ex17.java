// package Full for java prog;
// simple calculator
import java.util.*;
public class Ex17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        System.out.println("Enter the operation :");
        sc.nextLine();
        char opt = sc.nextLine().charAt(0);
        sc.close();

        int result=0;

        switch(opt){
        case '+':
            result= a+b;
            break;

        case '-':
            result= a-b;
            break;

        case '*':
            result= a*b;
            break;

        case '/':
            result= a/b;
            break;

        default:
            System.out.println("Invalid operation");
        }
    System.out.println("The result is :"+ result);
    }
}
