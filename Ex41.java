// number of the digit using while loop
import java.util.*;
public class Ex41 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        
        int numd = (int)Math.log10(n)+1;
        System.out.println("Number of digit is : "+ numd);
    }
    
}
