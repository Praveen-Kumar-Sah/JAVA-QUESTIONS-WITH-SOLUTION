// Average of given mark usig Array
import java.util.*;
public class Ex46 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of student : ");
        int n = sc.nextInt();

        int mark[] = new int[n];

        for(int i= 0; i<n; i++){
            System.out.println("Enter the  "+ i +" student marks :");
            mark[i] = sc.nextInt();
        }
        sc.close();
        
        int avg =0;

        for(int j= 0; j<n ; j++){
            avg += mark[j];
        }
        avg /= n;
        System.out.println("The verage of mark is : "+avg);
    }
    
}
