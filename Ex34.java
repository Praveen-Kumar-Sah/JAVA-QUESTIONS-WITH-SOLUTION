// pattern-3
import java.util.*;
public class Ex34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line number : ");
        int n = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
