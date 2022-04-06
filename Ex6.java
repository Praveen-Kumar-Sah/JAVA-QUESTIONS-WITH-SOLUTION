// package Full for java prog;
// take user input in java using Scanner class
import java.util.Scanner;
public class Ex6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // create scanner object by sc
        
        System.out.print("Enter two number:");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int sum=0;

        System.out.print("Enter your name:");
        String name= sc.next();

        System.out.print("Enter your height in cm:");
        double h= sc.nextDouble();
        sc.close();
        
        sum=x+y;
        System.out.println("Sum of given two number is :"+sum);
        System.out.println("Your name is :"+name);
        System.out.println("Your height is :"+h+"cm");
    }
    
}
