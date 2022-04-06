import java.util.*;
// Set data Structure in java , not allow duplicate element
public class Ex113 {
    public static void main(String[] args) {
        
        Set<String> ft = new HashSet<>();

        // add function
        ft.add("Apple");
        ft.add("Banana");
        ft.add("Kiwi");
        ft.add("Banana");

        System.out.println(ft);

        System.out.println(ft.add("Kiwi"));
        System.out.println(ft.add("Pineapple"));

        // remove function
        ft.remove("Banana");
        System.out.println(ft);

        // size function
        System.out.println(ft.size());

        Set<String> tr = new TreeSet<>();
                
        // add function
        tr.add("Banana");
        tr.add("Grapes");
        tr.add("Apple");
        
        System.out.println(tr);
        // return all
        ft.removeAll(tr);
        System.out.println(ft);
    }    
}
