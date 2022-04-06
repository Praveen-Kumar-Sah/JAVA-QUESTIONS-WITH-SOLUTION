import java.util.Arrays;

// print all value of array
public class Ex45 {
    public static void main(String args[]){
        short age[] = {2,3,4,9,7};
      
        System.out.print("The Array is : ");
        for(int i=0; i<age.length; i++){
            System.out.print(age[i]+" ");
        }
        System.out.println();
      
        Arrays.sort(age);
        // System.out.println(age);
        System.out.print("shorted array is :");
        for(short number : age){
            System.out.print(number+" ");
        }
    }
    
}
