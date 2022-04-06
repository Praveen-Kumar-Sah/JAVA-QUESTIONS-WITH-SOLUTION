// addition of two matrix using multi-D array
import java.util.*;
public class Ex48 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns : ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        
        int a[][] = new int [row][cols];
        int b[][] = new int [row][cols];

        System.out.println("Enter the element of first matrix as per row and cols : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of second matrix as per row and cols : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                b[i][j] = sc.nextInt();    
            }
        }

        sc.close();
        int c[][] = new int[row][cols];

        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of given two matrix is : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(c[i][j]+" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
    
}
