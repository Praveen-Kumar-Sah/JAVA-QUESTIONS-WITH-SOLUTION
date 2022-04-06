// Lincked List in java
import java.util.*;
public class Ex95{
    public static void main(String args[]){
        List<Integer> ll = new LinkedList<>();
        // add function
        ll.add(12);
        ll.add(2);
        ll.add(23);
        System.out.println(ll);

        // get function
        System.out.println(ll.get(2));

        // to array function
        ll.toArray();
        System.out.println(ll);

        // set function
        ll.set(2, 99);
        System.out.println(ll);

        // delete function
        ll.remove(1);
        System.out.println(ll);

    }

}