// sum of given series 
import java.util.*;
public class Ex28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        
        float result = 0;

        for(float i=1; i<=n; i++){
            result+=1/i;
        }
        System.out.println(result);
    }
    
}
