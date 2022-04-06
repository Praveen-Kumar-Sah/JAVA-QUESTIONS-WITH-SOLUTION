import java.util.*;
// Doubly Ended queue in java  (Array deque) both side operation
public class Ex107 {
    public static void main(String args[]){
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // add function
        ad.addFirst(50);
        ad.addFirst(45);
        ad.addLast(43);
        ad.addFirst(32);
        System.out.println(ad);

        // remove function
        ad.removeFirst();
        System.out.println(ad);
        ad.removeLast();
        System.out.println(ad);

        // push function
        ad.push(34);
        ad.push(33);
        System.out.println(ad);

        // set function
        int g = ad.getFirst();
        System.out.println(g);
    }
    
}
