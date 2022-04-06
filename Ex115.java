// Zero Sum SubArray in java
import java.util.*;
public class Ex115{
    public static void main(String[] args) {
        
        int a[] = {2,1,3,-4,-2};
        boolean faund = false;

        Set<Integer> st = new HashSet<>();
        int sum = 0;
        for(int element : a){
            st.add(sum);
            sum = sum + element;
            if(st.contains(sum)){
                faund = true;
                break;
            }
        }
        System.out.println("Found : "+ faund);
    }
}