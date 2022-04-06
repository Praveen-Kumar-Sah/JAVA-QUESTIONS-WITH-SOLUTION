import java.util.*;

// queue data structure in java first in first out
public class Ex104 {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        // add function
        q.add(23);
        q.add(43);
        q.add(54);
        q.add(98);
        System.out.println(q);

        // remove function
        q.remove();
        System.out.println(q);

        // element function
        System.out.println(q.element());
    }
    
}
