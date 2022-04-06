// power of a number using for loop
import java.util.*;
public class Ex26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the power : ");
        int b = sc.nextInt();
        sc.close();
        
        int result=1;
        for(int i=0;i<b;i++){
            result*=a;
        }
        System.out.println(result);
    }
    
}
