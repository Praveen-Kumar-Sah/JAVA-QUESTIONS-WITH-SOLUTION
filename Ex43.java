// do-while loop in java
// sum of the digit using do-while loop
import java.util.*;
public class Ex43 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number : ");
        int num = 1;
        
        do{
            num = sc.nextInt();
            System.out.println("number : "+ num);
        }while(num != 0);
        sc.close();
    }
    
}
