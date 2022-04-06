import java.util.*;
// Priority Queue in case ofcritical 
public class Ex109 {
    public static void main(String args[]){
        
        PriorityQueue<String> pq = new PriorityQueue<>();

        // Add function
        pq.add("Kiwi");
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Banana");
        
        System.out.println(pq);

        // remove function
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


        // with integer
        PriorityQueue<Integer> pi = new PriorityQueue<>();

        // Add function
        pi.add(2);
        pi.add(5);
        pi.add(9);
        pi.add(26);
        pi.add(4);
        pi.add(9);
        
        System.out.println(pi);

        // remove function
        System.out.println(pi.remove());
        System.out.println(pi.remove());
        System.out.println(pi.remove());
        System.out.println(pi.remove());

        System.out.println(pi);
    }
    
}
